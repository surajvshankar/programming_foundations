package challenge_chapter07;

public class ZoneFactory {
  public Zone createZone(String zoneid) {
    Zone zone = null;
    if (zoneid.equals("pst")) {
      zone = new ZoneUSPacific();
    } else if (zoneid.equals("est")){
      zone = new ZoneUSEastern();
    }
    return zone;
  }
}
