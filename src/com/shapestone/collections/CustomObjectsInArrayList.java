package com.shapestone.collections;

public class CustomObjectsInArrayList {

	private String name;
	private int id;
	private String school;

	public CustomObjectsInArrayList(String name, int id, String school) {
		
		this.name=name;
		this.id=id;
		this.school=school;
		
	}

	@Override
	public String toString() {
		return "CustomObjectsInArrayList [name=" + name + ", id=" + id + ", school=" + school + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getSchool() {
		return school;
	}


}
