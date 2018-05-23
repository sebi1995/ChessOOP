package pl.sda.patterns.strategy.duck;

import pl.sda.patterns.strategy.fly.FlyNoWay;
import pl.sda.patterns.strategy.quack.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
