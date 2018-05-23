package pl.sda.patterns.strategy.duck;

import pl.sda.patterns.strategy.fly.FlyWithWings;
import pl.sda.patterns.strategy.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
