package pl.sda.patterns.strategy.quack;

public class FakeQuack implements QuackBehavior {

	public void quack() {
		System.out.println("Qwak");
	}
}
