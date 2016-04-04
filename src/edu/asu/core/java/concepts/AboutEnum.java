package edu.asu.core.java.concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

enum CurrencyDenom{
	PENNY,NICKLE,DIME,QUARTER,DOLLAR,RUPEE,PAISE,ANA,CHARANA,BARANA,EURO
};


enum Country{
	INDIA,USA,ENGLAND
};

public class AboutEnum {
	
	Country country;
	List<CurrencyDenom> currencyDenom;
	
	public static void main(String[] args) {
		
		AboutEnum india = new AboutEnum();
		india.country = Country.INDIA;
		india.currencyDenom = new ArrayList<CurrencyDenom>();
		india.currencyDenom.add(CurrencyDenom.ANA);
		india.currencyDenom.add(CurrencyDenom.RUPEE);
		india.currencyDenom.add(CurrencyDenom.CHARANA);
		india.currencyDenom.add(CurrencyDenom.BARANA);
		india.currencyDenom.add(CurrencyDenom.PAISE);
		
		System.out.println(india.country);
		
	}
}
