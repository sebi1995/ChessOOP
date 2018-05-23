package pl.sda.patterns.strategy;

import pl.sda.patterns.strategy.duck.DecoyDuck;
import pl.sda.patterns.strategy.duck.MallardDuck;
import pl.sda.patterns.strategy.duck.ModelDuck;
import pl.sda.patterns.strategy.duck.RubberDuck;
import pl.sda.patterns.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();

		RubberDuck rubberDuckie = new RubberDuck();
		rubberDuckie.display();
		rubberDuckie.performQuack();

		DecoyDuck decoy = new DecoyDuck();
		decoy.display();
		decoy.performQuack();

		ModelDuck model = new ModelDuck();
		model.display();
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
