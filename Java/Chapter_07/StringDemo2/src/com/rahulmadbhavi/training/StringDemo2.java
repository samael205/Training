
package com.rahulmadbhavi.training;

class StringDemo2
{
	public static void main(String args[])
	{
		String str1 = "First String";
		String str2 = "Second String";
		String str3 = str1;
		String str4 = "First String";

		System.out.println("Original values");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		System.out.println("str1.hashCode() = " + str1.hashCode());
		System.out.println("str2.hashCode() = " + str2.hashCode());
		System.out.println("str3.hashCode() = " + str3.hashCode());
		System.out.println("str4.hashCode() = " + str4.hashCode());

		System.out.println("Length of string 1 : " + str1.length());
		System.out.println("Character at index 3 in str1 : " + str1.charAt(3));

		if(str1.equals(str2))
		{
			System.out.println("str1.equals(str2) == true");
		}
		else
		{
			System.out.println("str1.equals(str2) == false");
		}

		if(str1.equals(str3))
		{
			System.out.println("str1.equals(str3) == true");
		}
		else
		{
			System.out.println("str1.equals(str3) == false");
		}

		if(str1 == str3)
		{
			System.out.println("str1 == str3");
		}
		else
		{
			System.out.println("str1 != str3");
		}

		if(str1.equals(str4))
		{
			System.out.println("str1.equals(str4) == true");
		}
		else
		{
			System.out.println("str1.equals(str4) == false");
		}

		if(str1 == str4)
		{
			System.out.println("str1 == str4");
		}
		else
		{
			System.out.println("str1 != str4");
		}

		str3 = "Third String";
		System.out.println("\nUpdated values");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		System.out.println("str1.hashCode() = " + str1.hashCode());
		System.out.println("str2.hashCode() = " + str2.hashCode());
		System.out.println("str3.hashCode() = " + str3.hashCode());
		System.out.println("str4.hashCode() = " + str4.hashCode());

		if(str1.equals(str2))
		{
			System.out.println("str1.equals(str2) == true");
		}
		else
		{
			System.out.println("str1.equals(str2) == false");
		}

		if(str1.equals(str3))
		{
			System.out.println("str1.equals(str3) == true");
		}
		else
		{
			System.out.println("str1.equals(str3) == false");
		}

		if(str1 == str3)
		{
			System.out.println("str1 == str3");
		}
		else
		{
			System.out.println("str1 != str3");
		}		

		if(str1.equals(str4))
		{
			System.out.println("str1.equals(str4) == true");
		}
		else
		{
			System.out.println("str1.equals(str4) == false");
		}

		if(str1 == str4)
		{
			System.out.println("str1 == str4");
		}
		else
		{
			System.out.println("str1 != str4");
		}		
	}
}