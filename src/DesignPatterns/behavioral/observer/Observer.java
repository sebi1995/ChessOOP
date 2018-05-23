package pl.sda.dp.behavioral.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}