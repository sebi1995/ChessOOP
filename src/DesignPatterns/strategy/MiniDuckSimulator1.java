package pl.sda.patterns.strategy;

import pl.sda.patterns.strategy.duck.Duck;
import pl.sda.patterns.strategy.duck.MallardDuck;
import pl.sda.patterns.strategy.duck.ModelDuck;
import pl.sda.patterns.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
