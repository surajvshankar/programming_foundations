package challenge_chapter02;

public class ShareByEmail implements ShareBehavior{
  @Override
  public boolean share(String photo) {
    System.out.printf("Emailing %s ...", photo);
    return true;
  }
}
