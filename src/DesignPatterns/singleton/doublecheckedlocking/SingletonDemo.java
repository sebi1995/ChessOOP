package pl.sda.patterns.singleton.doublecheckedlocking;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton.getInstance().doSomething();
	}
}
