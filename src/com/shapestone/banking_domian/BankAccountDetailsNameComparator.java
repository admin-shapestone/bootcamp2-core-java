package com.shapestone.banking_domian;

import java.util.Comparator;

public class BankAccountDetailsNameComparator implements Comparator<BankAccountHoldersDetails> {

	@Override
	public int compare(BankAccountHoldersDetails o1, BankAccountHoldersDetails o2) {

		return o1.getName().compareTo(o2.getName());

	}

}
