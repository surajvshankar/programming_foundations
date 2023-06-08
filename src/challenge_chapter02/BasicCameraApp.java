package challenge_chapter02;

public class BasicCameraApp extends PhoneCameraApp{
  public BasicCameraApp() {
    this.sharePhoto = new ShareByText();
  }
  public void edit(String photo){
    System.out.print("Basic editing...");
  }
}
