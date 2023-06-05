package com.shapestone.fundementals;// package name

public class Identifers { // class name

	/**
	 *  what are the identifiers 
	 *  rules to define identifiers 
	 *  reserved words
	 *  
		  Programs and documentation
		   Identifier : A name in java is known as identifier.It may be a class
		  name,method name,varible name.
		  
		  1.class name : class name start with capital letter.if second word contain it
		  should be starts with capital letter. 
		  2.Interface : interface starts with upper case letter.if second letter contain it should starts with upper case letter.
		  3.package name : package name always in small letters.
		  4.varible name: varible name starts with lower case letter.if
		  second word contain it should starts with upper case letter. 
		  5.method name : method name also starts with lower case letter.if second contains it should
		  starts with upper case letter.
		  6. constants : constants always in upper case
		  only.
		  7. All keywords we need to write in lower case only.
		  
		  
		  Rules to define a identifiers :- 
		  
		  1. an identifer can contain only following characters
		    * A - Z
		    * a - z
		    * 0-9
		    * $
		    *  _
		  2. if we use other characters we will get compile time exception.
		  
		  *int # = 10; // i valid
		  *int $ = 10;// valid
		  
		  3. An identifier starts with Alphabit,dollar,and under score but not with number.
		     * int $alrey = 1000; //valid
		     * int _value =2000; // valid
		     * int 1Abc = 1000;// in valid
		      
		  4.We can't take reserved word as identifier.
		     * int if = 10;// invalid
		     * int class =10;//invalid
		      
		  5. Identifier can be alpha numeric also
		     * int emp_123=100;//valid
		     * int emp$123 = 100;//valid
		     * int emp#123 = 100;//in valid;
		  6.We can take predefine class name and interface name as identifer name but its not a good practice.
		     * int String = 10;  // valid
		     * int Runnable = 10;// valid
		  
		  
		  
		  Reserved word :
		  
		  In java there are 53 reserved words.All the reserved word declare in lowwer case only.
		  
		  Reserved are divided into two types.
		  1.keyword - They are 50 keywords java.
		  2.Reserved literals  - they are 3 reserved literals (true,false,null).
		  
		  Keyword are defined into two types 
		  1. used Keywords - 48.
		  2. unused keyword - 2 (goto,const)
		  
		 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int varibleName = 20; // varible name
		
		final int CONST = 10; //  All the constants are in uppercase only. 10 is a literl.
		System.out.println(varibleName +" "+CONST);
		
		
	}

}
