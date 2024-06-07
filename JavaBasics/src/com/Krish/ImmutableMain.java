package com.Krish;

import java.util.ArrayList;
import java.util.List;

public class ImmutableMain {
	public static void main(String[] args) {

		Engine e = new Engine(50);
		List<String> features = new ArrayList<String>();
		features.add("Moonroof");
		features.add("RemoteStart");
		features.add("BlindSpot Sensor");
		ImmutableClass ic = new ImmutableClass(1, "Nissan", e, features);
		System.out.println(ic.getId());
		System.out.println(ic.getName());
		e.speed = 55;		
		features.add("abc");
		ic.getFeature().add("abc");
		System.out.println(ic.getEngine().speed);
		System.out.println(ic.getFeature());
	}


}
