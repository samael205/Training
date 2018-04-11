
package com.rahulmadbhavi.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		ArrayList<NamePhoneEmail> myList = new ArrayList<>();
		
		myList.add(new NamePhoneEmail("abc", "123456", "abc@example.com"));
		myList.add(new NamePhoneEmail("def", "456789", "def@example.com"));
		myList.add(new NamePhoneEmail("ghi", "987654", "ghi@example.com"));
		
		// Map just the names and phone numbers to a new stream.
		Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.getName(), a.getPhoneNumber()));
		
		// Use collect to create a list of the names and phone numbers.
		List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
		
		System.out.println("Names and phone numbers in a list : ");
		for(NamePhone namePhone : npList)
		{
			System.out.println(namePhone.getName() + ": " + namePhone.getPhoneNumber());
		}
		
		// Obtain another mapping of the names and phone numbers.
		nameAndPhone = myList.stream().map((a) -> new NamePhone(a.getName(), a.getPhoneNumber()));
		
		// Now, create a set by use of collect.
		Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
		
		System.out.println("\nNames and phone numbers in a Set:");
		
		for(NamePhone namePhone: npSet)
		{
			System.out.println(namePhone.getName() + ": " + namePhone.getPhoneNumber());
		}
	}
}
