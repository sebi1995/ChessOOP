package pl.sda.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	// normal shopping cart stuff

	private List<Visitable> items = new ArrayList<>();

	public void addItem(Visitable item) {
		items.add(item);
	}

	public double calculatePostage() {
		// create a visitor
		PostageVisitor visitor = new PostageVisitor();
		// iterate through all items
		for (Visitable item : items) {
			item.accept(visitor);
		}
		return visitor.getTotalPostage();
	}
}