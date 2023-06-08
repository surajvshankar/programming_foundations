package challenge_chapter07;

public abstract class Zone {
  protected String displayName = "Undefined";
  protected int offset = 0;

  public String getDisplayName(){
    return this.displayName;
  }
  public int getOffset(){
    return this.offset;
  }
  abstract void setDisplayName(String displayName);
  abstract void setOffset(int offset);
}
