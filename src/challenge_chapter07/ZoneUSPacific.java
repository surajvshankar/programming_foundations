package challenge_chapter07;

public class ZoneUSPacific extends Zone{
  ZoneUSPacific() {
    setDisplayName("US Pacific");
    setOffset(-8);
  }
  @Override
  void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @Override
  void setOffset(int offset) {
    this.offset = offset;
  }
}
