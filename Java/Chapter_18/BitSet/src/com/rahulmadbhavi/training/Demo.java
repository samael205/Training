
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static String bitSetToString(BitSet bitSet)
	{
		char set[] = new char[bitSet.size()];
		int size = bitSet.size();

		for(int i=0; i<size; i++)
		{
			set[size - i - 1] = bitSet.get(i) ? '1' : '0';
		}
		
		return (new String(set));
	}

	public static void main(String args[])
	{
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);
		BitSet bits3 = new BitSet(16);

		for(int i=0; i<16; i++)
		{
			if((i%2) == 0)
			{
				bits1.set(i);
			}
			if((i%5) != 0)
			{
				bits2.set(i);
				bits3.set(i);
			}
		}

		System.out.println();

		System.out.println("Initial pattern in bits1 : ");
		System.out.println(bitSetToString(bits1));
		System.out.println(bits1);
		System.out.println();

		System.out.println("Initial pattern in bits2 : ");
		System.out.println(bitSetToString(bits2));
		System.out.println(bits2);
		System.out.println();

		System.out.println("        " + bitSetToString(bits2));
		System.out.println("AND     " + bitSetToString(bits1));
		bits2.and(bits1);
		System.out.println("=       " + bitSetToString(bits2));
		System.out.println();

		System.out.println("        " + bitSetToString(bits2));
		System.out.println("OR      " + bitSetToString(bits1));
		bits2.or(bits1);
		System.out.println("=       " + bitSetToString(bits2));
		System.out.println();

		System.out.println("        " + bitSetToString(bits1));
		System.out.println("XOR     " + bitSetToString(bits2));
		bits2.xor(bits1);
		System.out.println(" =      " + bitSetToString(bits2));
		System.out.println();

		System.out.println("        " + bitSetToString(bits3));
		System.out.println("ANDNOT  " + bitSetToString(bits1));
		bits3.andNot(bits1);
		System.out.println(" =      " + bitSetToString(bits3));
		System.out.println();

		System.out.println("        " + bitSetToString(bits3));
		System.out.println("Cardinality : " + bits3.cardinality());
		System.out.println();

		System.out.println("bits3 = " + bitSetToString(bits3));
		bits3.clear(3, 7);
		System.out.println("bits3.clear(3, 7);");
		System.out.println("bits3 = " + bitSetToString(bits3));
		System.out.println();

		System.out.println("bits3 = " + bitSetToString(bits3));
		bits3.flip(3);
		System.out.println("bits3.flip(3);");
		System.out.println("bits3 = " + bitSetToString(bits3));
		System.out.println();

		System.out.println("bits3 = " + bitSetToString(bits3));
		bits3.flip(3, 6);
		System.out.println("bits3.flip(3, 6);");
		System.out.println("bits3 = " + bitSetToString(bits3));
		System.out.println();

		System.out.println("           " + bitSetToString(bits3));
		System.out.println("INTERSECTS "+ bitSetToString(bits1));
		System.out.println(" =  " + bits3.intersects(bits1));
		System.out.println();

		System.out.println("(" + bitSetToString(bits3) + ").isEmpty() : " + bits3.isEmpty());		
		System.out.println("(" + bitSetToString(bits2) + ").isEmpty() : " + bits2.isEmpty());		
		System.out.println();
	}
}