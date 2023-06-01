package com.shapestone.inheritance;

public class User {
	public static void main(String[] args) {
		Guest guest = new Guest();
		guest.read();
		Developer dev = new Developer();
		dev.read();
		dev.write();
		Admin admin = new Admin();
		admin.read();
		admin.write();
		admin.manage();
	}
}

 /**
Read code
Read code
write code
Read code
write code
Manage code 
*/