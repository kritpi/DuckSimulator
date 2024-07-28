public class GooseAdapter implements Quackable {
  Goose goose;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
  }

  public void quack() {
    goose.honk();
  }
}//6510405300 Kritpiruch Chaiwong
