public class PoliteDuck implements Quackable {
  Quackable duck;
  private static int politeCount = 0;

  public PoliteDuck(Quackable duck) {
    this.duck = duck;
    politeCount++;
  }
  public void quack() {
    duck.quack();
    System.out.println(" Kubb");
  }

  public static int getPoliteCount() {
    return politeCount;
  }
}