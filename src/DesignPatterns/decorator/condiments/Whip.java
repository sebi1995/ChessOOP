package pl.sda.patterns.decorator.condiments;

import pl.sda.patterns.decorator.coffee.Beverage;

public class Whip extends CondimentDecorator {

	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
