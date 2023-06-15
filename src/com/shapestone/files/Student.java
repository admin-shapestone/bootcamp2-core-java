package com.shapestone.files;
public class Student {
	private String name;
	private String fathername;
	private String mothername;
	private  Result marks;
	
	public Result getMarks() {
		return marks;
	}
	public void setMarks(Result marks) {
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	
}
	