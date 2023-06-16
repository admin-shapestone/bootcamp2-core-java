package com.shapestone.files;

public class Result{
	
	private String telugu;
    private String hindi;
    private String english;
    private String maths;
    private String physics;
    private String chemistry;
    
	@Override
	public String toString() {
		return "Result [telugu=" + telugu + ", hindi=" + hindi + ", english=" + english + ", maths=" + maths
				+ ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	public String getTelugu() {
		return telugu;
	}
	public void setTelugu(String telugu) {
		this.telugu = telugu;
	}
	public String getHindi() {
		return hindi;
	}
	public void setHindi(String hindi) {
		this.hindi = hindi;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getPhysics() {
		return physics;
	}
	public void setPhysics(String physics) {
		this.physics = physics;
	}
	public String getChemistry() {
		return chemistry;
	}
	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

    
}