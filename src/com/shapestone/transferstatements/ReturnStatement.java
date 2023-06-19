package com.shapestone.TransferStatements;

public class ReturnStatement {
    public int CompareNum()
    {
    	 int x = 3;
    	 int y = 8;
    	 System.out.println("x=" +x+ "\ny=" +y);
    	 if (x>y)
    		 return x;
    	 else
    		 return y;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReturnStatement obj = new ReturnStatement();
int result = obj.CompareNum();
System.out.println("The greater number among X and Y is:" +result);
}
}
