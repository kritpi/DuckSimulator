public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();
    simulator.simulate(duckFactory);
  }

  void simulate(AbstractDuckFactory duckFactory) {
    Quackable mallardDuck = new PoliteDuck(duckFactory.createMallardDuck());
    Quackable redheadDuck = new PoliteDuck(duckFactory.createRedheadDuck());
    Quackable duckCall = new PoliteDuck(duckFactory.createDuckCall());
    Quackable rubberDuck = new PoliteDuck(duckFactory.createRubberDuck());
    Quackable mallardDuckFactory = duckFactory.createMallardDuck();

    Quackable gooseDuck = new GooseAdapter(new Goose());
    Quackable pigeonDuck = new PigeonAdapter(new Pigeon());
    
    Flock flockOfDucks = new Flock();
    flockOfDucks.add(mallardDuck);
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(mallardDuckFactory);
    
    System.out.println("\nDuck Simulator");
  
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);
    simulate(flockOfDucks);
    
    simulate(gooseDuck);
    simulate(pigeonDuck);
    
    System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    System.out.println("There are: " + PoliteDuck.getPoliteCount() + " Polite Ducks");
  }

  void simulate(Quackable duck) {
    duck.quack();
  }
}
