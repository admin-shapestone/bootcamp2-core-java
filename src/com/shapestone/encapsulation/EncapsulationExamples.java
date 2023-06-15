package com.shapestone.encapsulation;

public class EncapsulationExamples {

	public static void main(String[] args) {
		class Person {
		    private String name;
		    private int age;
		 
		    public String getName(){ return name; }
		 
		    public void setName(String name) { this.name = name; }
		 
		    public int getAge() { return age; }
		 
		    public void setAge(int age) { this.age = age; }
		}
		    {
		        Person person = new Person();
		        person.setName("Gopi");
		        person.setAge(25);
		 
		        System.out.println("Name: " + person.getName());
		        System.out.println("Age: " + person.getAge());
		    }
		}
		
		
	}


