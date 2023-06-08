package challenge_chapter02;

public class ShareByText implements ShareBehavior{
  @Override
  public boolean share(String photo) {
    System.out.printf("Sharing %s by text ...", photo);
    return true;
  }
}
