package pl.sda.patterns.visitor;

public class PostageVisitor implements Visitor {

	private double totalPostageForCart;

	// collect data about the book
	@Override
	public void visit(Book book) {

		// assume we have a calculation here related to weight and price
		// free postage for a book over 10
		if (book.getPrice() < 10.0) {
			totalPostageForCart += book.getWeight() * 2;
		}
	}

	//add other visitors here
	@Override
	public void visit(CD cd) {
		// not implemented
	}

	@Override
	public void visit(DVD dvd) {
		// not implemented
	}

	// return the internal state
	public double getTotalPostage() {
		return totalPostageForCart;
	}
}