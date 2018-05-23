package pl.sda.patterns.visitor;

public interface Visitable {

	void accept(Visitor visitor);
}
