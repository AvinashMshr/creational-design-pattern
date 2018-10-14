package org.avinash.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	Map<String, Element> elements = new HashMap<String, Element>();
	
	public Registry() {
		loadElements();
	}

	public Element createElement(String type) {
		Element element = null;
		
		try {
			element = (Element)elements.get(type).clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return element;
	}
	
	void loadElements() {
		Ball ball = new Ball();
		ball.setCost(20.9);
		ball.setDetail("This is ball");
		ball.setName("Green ball");
		ball.setRuntime("2.4 hour");
		elements.put("Ball", ball);
		
		Bat bat = new Bat();
		bat.setCost(20.9);
		bat.setDetail("This is bat");
		bat.setName("Red bat");
		bat.setRuntime("4.4 hour");
		elements.put("Bat", bat);
		
	}
}
