
package com.rahulmadbhavi.training;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Demo
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer, Double> map = new LinkedHashMap<Integer, Double>();
		Map.Entry<Integer, Double> entries;
		Set<Map.Entry<Integer, Double>> set;

		System.out.println();

		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println();

		System.out.println("map.put(1, 1.0);");
		System.out.println("map.put(2, 2.0);");
		System.out.println("map.put(3, 3.0);");
		System.out.println("map.put(5, 5.0);");
		System.out.println("map.put(6, 6.0);");
		System.out.println("map.put(7, 7.0);");
		System.out.println("map.put(8, 8.0);");
		System.out.println();

		map.put(1, 1.0);
		map.put(2, 2.0);
		map.put(3, 3.0);
		map.put(5, 5.0);
		map.put(6, 6.0);
		map.put(7, 7.0);
		map.put(8, 8.0);

		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.containsKey(3) : " + map.containsKey(3));
		System.out.println("map.containsKey(4) : " + map.containsKey(4));
		System.out.println();

		System.out.println("set = map.entrySet();");
		set = map.entrySet();
		System.out.println("set : " + set);
		System.out.println();

		System.out.println("map.keySet() : " + map.keySet());
		System.out.println();

		System.out.println("map.values() : " + map.values());
		System.out.println();

		System.out.println("map.size() : " + map.size());
		System.out.println();

		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.remove(5) : " + map.remove(5));
		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.clear();");
		map.clear();
		System.out.println();

		System.out.println("map : " + map);
		System.out.println();
	}
}