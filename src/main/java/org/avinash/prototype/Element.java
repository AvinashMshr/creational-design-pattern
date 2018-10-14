package org.avinash.prototype;

public abstract class Element implements Cloneable{
	private String name;
	private double cost;
	private String detail;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
