package com.Krish;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {


	private final int id;
	private final String name;
	private final Engine engine;
	private final List<String> feature;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public Engine getEngine() {
		Engine eng = new Engine(this.engine.speed);
		return eng;
	}
	public List<String> getFeature() {
		
		List<String> lstFeatures = new ArrayList<>(this.feature);
		return lstFeatures;
	}

	public ImmutableClass(int id, String name, Engine engine, List<String> features) {
		this.id = id;
		this.name = name;
		Engine newEngine = new Engine(engine.speed);
		this.engine = newEngine;
		this.feature = new ArrayList<>(features);
		/*
		 * for (String featur:features) { feature.add(featur); }
		 */
	}

}

class Engine{

	int speed;
	public Engine(int speed)
	{
		this.speed = speed;
	}
}
