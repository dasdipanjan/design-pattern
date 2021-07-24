package com.dd.dp.cp.prototype;

//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Generals are always unique.");
	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException("Reset is not supported.");
	}
	
	
}
