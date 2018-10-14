package org.avinash.creational_design_pattern;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {

	public void testSingleto() {
		assertTrue(Singleton.getInstance() == Singleton.getInstance());
	}
}
