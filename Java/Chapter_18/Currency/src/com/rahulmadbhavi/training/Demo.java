
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Currency currency = Currency.getInstance(Locale.US);

		System.out.println();
		System.out.println("Currency Code     : " + currency.getCurrencyCode());
		System.out.println("Fractional Digits : " + currency.getDefaultFractionDigits());
		System.out.println("Symbol            : " + currency.getSymbol());
		System.out.println("Currency          : " + currency);
		System.out.println();
	}
}