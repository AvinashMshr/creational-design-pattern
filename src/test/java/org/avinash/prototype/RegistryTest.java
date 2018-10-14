package org.avinash.prototype;

import junit.framework.TestCase;

public class RegistryTest extends TestCase {
	
	Registry registry = new Registry();
	Ball ball1 = (Ball) registry.createElement("Ball");
	Ball ball2 = (Ball) registry.createElement("Ball");
	public void test() {
		ball1.setName("My Ball");
		assertNotSame(ball1, ball2);
		assertNotSame(ball1.getName(), ball2.getName());
	}

}
