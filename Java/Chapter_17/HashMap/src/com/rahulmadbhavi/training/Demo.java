
package com.rahulmadbhavi.training;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

class Demo
{
	public static void main(String args[])
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Set<Map.Entry<Integer, String>> entrySet;

		System.out.println();

		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println();

		System.out.println("map.containsKey(1) : " + map.containsKey(1));
		System.out.println();

		System.out.println("map.containsValue(\"One\") : " + map.containsValue("One"));
		System.out.println();

		System.out.println("map.put(1, \"One\");");
		System.out.println("map.put(2, \"Two\");");
		System.out.println("map.put(3, \"Three\");");
		System.out.println();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		System.out.println("map : " + map);
		System.out.println();

		System.out.println("entrySet = map.entrySet();");
		entrySet = map.entrySet();
		System.out.println("Iterating through entrySet");
		for(Map.Entry<Integer, String> pair : entrySet)
		{
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}
		System.out.println();

		System.out.println("map.get(2) : " +map.get(2));
		System.out.println("map.get(4) : " +map.get(4));
		System.out.println();

		System.out.println("map.getOrDefault(2, \"Missing\") : " +map.getOrDefault(2, "Missing"));
		System.out.println("map.getOrDefault(4, \"Missing\") : " +map.getOrDefault(4, "Missing"));
		System.out.println();

		System.out.println("map.keySet() : " + map.keySet());
		System.out.println();

		System.out.println("map.size() : " + map.size());
		System.out.println();

		System.out.println("map.values() : " + map.values());
		System.out.println();

		System.out.println("map.replace(3, \"Four\", \"Three Updated\") : " + map.replace(3, "Four", "Three Updated"));
		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.replace(3, \"Three\", \"Three Updated\") : " + map.replace(3, "Three", "Three Updated"));
		System.out.println("map : " + map);
		System.out.println();
		
		System.out.println("map.replace(4, \"Four\") : " + map.replace(4, "Four"));
		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.replace(3, \"Three\") : " + map.replace(3, "Three"));
		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.clear();");
		map.clear();
		System.out.println("map : " + map);
		System.out.println();
	}
}