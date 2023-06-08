package challenge_chapter02;

public class CameraPlusApp extends PhoneCameraApp{
  public CameraPlusApp() {
    this.sharePhoto = new ShareByEmail();
  }

  @Override
  public void edit(String photo){
    System.out.printf("Editing %s...", photo);
  }
}
