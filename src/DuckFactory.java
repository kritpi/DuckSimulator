public class DuckFactory extends AbstractDuckFactory {
  public Quackable createMallardDuck() {
    return new PoliteDuck(new MallardDuck());
  }
  public Quackable createRedheadDuck() {
    return new PoliteDuck(new RedheadDuck());
  }
  public Quackable createDuckCall() {
    return new PoliteDuck(new DuckCall());
  }
  public Quackable createRubberDuck() {
    return new PoliteDuck(new RubberDuck());
  }
  
}
//6510405300 Kritpiruch Chaiwong
