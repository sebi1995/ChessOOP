package pl.sda.patterns.strategy.duck;

import pl.sda.patterns.strategy.fly.FlyNoWay;
import pl.sda.patterns.strategy.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
