package com.rahulmadbhavi.training;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		// A list of names, phone numbers, and e-mail addresses.
		ArrayList<NamePhoneEmail> myList = new ArrayList<>();
		
		myList.add(new NamePhoneEmail("def", "456789", "def@example.com"));
		myList.add(new NamePhoneEmail("xyz", "123456", "xyz@example.com"));
		myList.add(new NamePhoneEmail("abc", "987654", "abc@example.com"));
		
		System.out.print("Original values in myList : ");
		myList.stream().forEach((a) -> System.out.print(a + " "));
		System.out.println();
		
		// Map just the names and phone numbers to a new stream.
		Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.getName(), a.getPhoneNumber()));
		
		System.out.println("List of names and phone numbers:");
		nameAndPhone.forEach((a) -> System.out.println(a.getName() + ": " + a.getPhoneNumber()));
	}
}
