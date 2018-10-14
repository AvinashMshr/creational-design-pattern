package org.avinash.creational_design_pattern;

public class Singleton {
	public static volatile Singleton instance = null;
	
	private Singleton() {
		if(instance != null) {
			throw new RuntimeException("Use getInstance method to get object");
		}
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}

}
