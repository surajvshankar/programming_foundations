package challenge_chapter02;

public abstract class PhoneCameraApp {
  protected ShareBehavior sharePhoto;
  final public boolean share(String photo) {
    return sharePhoto.share(photo);
  }

  abstract public void edit(String photo);
  public void take() { System.out.println("Captured");}
  protected boolean save() { return true; }
}
