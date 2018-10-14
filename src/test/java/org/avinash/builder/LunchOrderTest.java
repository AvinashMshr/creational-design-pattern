package org.avinash.builder;

import junit.framework.TestCase;

public class LunchOrderTest extends TestCase {
	public void test() {
		LunchOrder lunchOrder = new LunchOrder.Builder()
				.bread("white")
				.daal("yellow")
				.greavy("veg")
				.rice("fried")
				.build();
		
		assert("white".equals(lunchOrder.getBread()));
		assert("yellow".equals(lunchOrder.getDaal()));
		assert("veg".equals(lunchOrder.getGreavy()));
		assert("fried".equals(lunchOrder.getRice()));
	}

}
