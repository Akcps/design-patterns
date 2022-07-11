package io.github.akcps.behavioral.observer.weather;

public interface Observer {
	void update(float temp, float humidity, float pressure);
}
