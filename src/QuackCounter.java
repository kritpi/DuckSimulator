public class QuackCounter implements Quackable {
  Quackable duck;
  static int numberOfQuacks;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
  }

  public void quack() {
    duck.quack();
    numberOfQuacks++;
  }

  public static int getQuacks() {
    return numberOfQuacks;
  }
}
//6510405300 Kritpiruch Chaiwong
