package challenge_chapter02;

public class ShareToSocial implements ShareBehavior{
  @Override
  public boolean share(String photo) {
    System.out.printf("Sharing %s with Social Media...", photo);
    return true;
  }
}
