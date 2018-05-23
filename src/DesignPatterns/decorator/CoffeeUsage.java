package pl.sda.patterns.decorator;

import pl.sda.patterns.decorator.coffee.Espresso;
import pl.sda.patterns.decorator.condiments.Mocha;
import pl.sda.patterns.decorator.condiments.Soy;
import pl.sda.patterns.decorator.condiments.Whip;
import pl.sda.patterns.decorator.coffee.Beverage;
import pl.sda.patterns.decorator.coffee.DarkRoast;
import pl.sda.patterns.decorator.coffee.HouseBlend;

public class CoffeeUsage {

	public static void main(String args[]) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());

		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

		Beverage houeseBlend = new HouseBlend();
		houeseBlend = new Soy(houeseBlend);
		houeseBlend = new Mocha(houeseBlend);
		houeseBlend = new Whip(houeseBlend);
		System.out.println(houeseBlend.getDescription() + " $" + houeseBlend.cost());
	}
}
