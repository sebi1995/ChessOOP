package pl.sda.patterns.strategy.duck;

import pl.sda.patterns.strategy.fly.FlyNoWay;
import pl.sda.patterns.strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
