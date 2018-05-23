package pl.sda.patterns.decorator.condiments;

import pl.sda.patterns.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();
}
