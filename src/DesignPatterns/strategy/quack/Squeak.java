package pl.sda.patterns.strategy.quack;

public class Squeak implements QuackBehavior {

	public void quack() {
		System.out.println("Squeak");
	}
}
