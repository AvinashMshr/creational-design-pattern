package org.avinash.builder;

public class LunchOrder {
	private final String bread;
	private final String rice;
	private final String greavy;
	private final String daal;
	
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.rice = builder.rice;
		this.greavy = builder.greavy;
		this.daal = builder.daal;
	}
	
	public String getBread() {
		return bread;
	}
	public String getRice() {
		return rice;
	}
	public String getGreavy() {
		return greavy;
	}
	public String getDaal() {
		return daal;
	}
	public static class Builder{
		private String bread;
		private String rice;
		private String greavy;
		private String daal;
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		public Builder rice(String rice) {
			this.rice = rice;
			return this;
		}
		public Builder greavy(String greavy) {
			this.greavy = greavy;
			return this;
		}
		public Builder daal(String daal) {
			this.daal = daal;
			return this;
		}
	}

}
