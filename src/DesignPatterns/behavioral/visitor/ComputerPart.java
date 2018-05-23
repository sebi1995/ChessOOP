package pl.sda.dp.behavioral.visitor;

public interface ComputerPart {
	void accept(ComputerPartVisitor computerPartVisitor);
}