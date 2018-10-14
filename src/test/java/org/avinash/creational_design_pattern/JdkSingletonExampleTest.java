package org.avinash.creational_design_pattern;

import junit.framework.TestCase;

public class JdkSingletonExampleTest extends TestCase {

	public void testApp() {
		assertTrue(JdkSingletonExample.singletonExample());
	}
}
