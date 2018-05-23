package pl.sda.dp.structural.decorator;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}