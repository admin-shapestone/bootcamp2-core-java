package com.shapestone.TransferStatements;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			if (i == 4) {
				break;
			}
		}
	}

}
