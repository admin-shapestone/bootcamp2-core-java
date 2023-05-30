package com.shapestone.variablesandtypes;

public class Students {
		public static void main(String[] args) {
			Functions[] students = new Functions[] {
					new Functions("Sree", "Rama")};
					new Functions("Radha", "Krishna");
					new Functions("Sree", "Krishna"); 
			
			for(Functions s: students) {
				s.printFullName();
			}
		}
	}