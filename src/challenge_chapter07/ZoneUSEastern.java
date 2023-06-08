package challenge_chapter07;

public class ZoneUSEastern extends Zone{
  ZoneUSEastern() {
    setDisplayName("US Eastern");
    setOffset(-5);
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
