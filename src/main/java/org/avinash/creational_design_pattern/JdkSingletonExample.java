package org.avinash.creational_design_pattern;

public class JdkSingletonExample {
	
	public static boolean singletonExample() {
		Runtime singletonRuntime = Runtime.getRuntime();
		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime anotherRuntime = Runtime.getRuntime();
		
		System.out.println(anotherRuntime);
		
		if(singletonRuntime == anotherRuntime) {
			System.out.println("Objects are same");
			return true;
		}
		
		System.out.println("Objects are not same");
		return false;
	}


}
