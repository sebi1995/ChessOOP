package pl.sda.dp.structural.proxy;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		//Image image = new ProxyImage("test_10mb.jpg");
		// image will be loaded from disk
		//image.display();
		System.out.println("");
		// image will not be loaded from disk
		//image.display();

		Image image = getImage("hahahah");
		image.display();
		image.display();

	}

	static Image getImage(String name) {
		int rnd = (int) Math.random() * 5;
		if (rnd < 3) {
			return new RealImage(name);
		}
		return new ProxyImage(name);
	}
}