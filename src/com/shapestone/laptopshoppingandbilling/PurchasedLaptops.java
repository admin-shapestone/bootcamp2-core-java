package com.shapestone.laptopshoppingandbilling;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PurchasedLaptops {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper purchase = new ObjectMapper();
		Customers[] customer = purchase.readValue(new java.io.File("customers.json"), Customers[].class);
		Purchases[] today = purchase.readValue(new java.io.File("purchases.json"), Purchases[].class);
          String todayPurchase ="2023-06-21";
		for (int i = 0; i <= customer.length - 1; i++) {
			if(todayPurchase.equals(customer[i].getDateOfPurchase()))
			{
			  System.out.println("Customer ID         : " + customer[i].getCustomerId());
			  System.out.println("Name                : " + customer[i].getName());
			  System.out.println("Age                 : " + customer[i].getAge());
			  System.out.println("Gender              : " + customer[i].getGender());
			  System.out.println("Date Of Purchase: " + customer[i].getDateOfPurchase());
			}
			//System.out.println("--------------------------------------------------------");
		
		}
	
		  for (int j = 0; j < today.length - 1; j++) {
			  if(todayPurchase.equals(customer[j].getDateOfPurchase())) 
			  {
				  System.out.println("Purchased ID: " + today[j].getPurchaseId());
				  System.out.println("Customer ID : " + today[j].getCustomerId());
				  System.out.println("Product     : " + today[j].getProduct());
				  System.out.println("Price       : " + today[j].getPrice());
			  }
		 // System.out.println("--------------------------------------------------------" );
		  
		  }
		 
			  
	
	}
}
