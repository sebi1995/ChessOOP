package pl.sda.patterns.visitor;

import java.util.Calendar;

public class ShopUsage {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Book(5.0, 10.0));
		cart.addItem(new Book(8.0, 2.0));
		cart.addItem(new Book(15.0, 2.0));
		System.out.println("Postage price is: " + cart.calculatePostage());

		Calendar instance = Calendar.getInstance();
	}
}
