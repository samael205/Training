
package com.rahulmadbhavi.training;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

class Demo
{
	public static void main(String args[])
	{
		TreeMap<Integer, Double> map = new TreeMap<Integer, Double>();

		System.out.println();

		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println();

		System.out.println("map.size() : " + map.size());
		System.out.println();

		System.out.println("map.put(1, 1.0) : " + map.put(1, 1.0));
		System.out.println("map.put(2, 2.0) : " + map.put(2, 2.0));
		System.out.println("map.put(4, 4.0) : " + map.put(4, 4.0));
		System.out.println("map.put(5, 5.0) : " + map.put(5, 5.0));
		System.out.println("map.put(6, 6.0) : " + map.put(6, 6.0));
		System.out.println("map.put(7, 7.0) : " + map.put(7, 7.0));
		System.out.println("map.put(8, 8.0) : " + map.put(8, 8.0));
		System.out.println();

		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.size() : " + map.size());
		System.out.println();

		Map.Entry<Integer, Double> entries = map.ceilingEntry(3);
		System.out.println("entries = map.ceilingEntry(3);");
		System.out.println("entries.getKey()   : " + entries.getKey());
		System.out.println("entries.getValue() : " + entries.getValue());
		System.out.println();

		entries = map.floorEntry(3);
		System.out.println("entries = map.floorEntry(3);");
		System.out.println("entries.getKey()   : " + entries.getKey());
		System.out.println("entries.getValue() : " + entries.getValue());
		System.out.println();

		entries = map.firstEntry();
		System.out.println("entries = map.firstEntry();");
		System.out.println("entries.getKey()   : " + entries.getKey());
		System.out.println("entries.getValue() : " + entries.getValue());
		System.out.println();

		entries = map.lastEntry();
		System.out.println("entries = map.lastEntry();");
		System.out.println("entries.getKey()   : " + entries.getKey());
		System.out.println("entries.getValue() : " + entries.getValue());
		System.out.println();

		entries = map.lowerEntry(4);
		System.out.println("entries = map.lowerEntry(4);");
		System.out.println("entries.getKey()   : " + entries.getKey());
		System.out.println("entries.getValue() : " + entries.getValue());
		System.out.println();

		entries = map.higherEntry(4);
		System.out.println("entries = map.higherEntry(4);");
		System.out.println("entries.getKey()   : " + entries.getKey());
		System.out.println("entries.getValue() : " + entries.getValue());
		System.out.println();

		System.out.println("map.ceilingKey(3) : " + map.ceilingKey(3));
		System.out.println();

		System.out.println("map.floorKey(3) : " + map.floorKey(3));
		System.out.println();

		System.out.println("map.firstKey() : " + map.firstKey());
		System.out.println();

		System.out.println("map.lastKey() : " + map.lastKey());
		System.out.println();

		System.out.println("map.lowerKey(4) : " + map.lowerKey(4));
		System.out.println();

		System.out.println("map.higherKey(4) : " + map.higherKey(4));
		System.out.println();

		System.out.println("map.containsKey(4) : " + map.containsKey(4));
		System.out.println("map.containsKey(9) : " + map.containsKey(9));
		System.out.println();

		System.out.println("map.containsValue(4.0) : " + map.containsValue(4.0));
		System.out.println("map.containsValue(9.0) : " + map.containsValue(9.0));
		System.out.println();

		System.out.println("map.keySet() : " + map.keySet());
		System.out.println();

		System.out.println("map.descendingKeySet() : " + map.descendingKeySet());
		System.out.println();

		System.out.println("map.descendingMap() : " + map.descendingMap());
		System.out.println();

		System.out.println("map.navigableKeySet() : " + map.navigableKeySet());
		System.out.println();

		System.out.println("Iterating through map.entrySet();");
		Set<Map.Entry<Integer, Double>> set = map.entrySet();
		for(Map.Entry<Integer, Double> entry : set)
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();

		System.out.println("map.get(4) : " + map.get(4));
		System.out.println();

		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.subMap(2, 7) : " + map.subMap(2, 7));
		System.out.println();

		System.out.println("map.subMap(2, false, 7, false) : " + map.subMap(2, false, 7, false));
		System.out.println("map.subMap(2, false, 7, true ) : " + map.subMap(2, false, 7, true));
		System.out.println("map.subMap(2, true,  7, false) : " + map.subMap(2, true, 7, false));
		System.out.println("map.subMap(2, true,  7, true ) : " + map.subMap(2, true, 7, true));
		System.out.println();

		System.out.println("map.headMap(5) : " + map.headMap(5));
		System.out.println();

		System.out.println("map.headMap(5, true) : " + map.headMap(5, true));
		System.out.println();

		System.out.println("map.tailMap(5) : " + map.tailMap(5));
		System.out.println();

		System.out.println("map.tailMap(5, true) : " + map.tailMap(5, true));
		System.out.println();

		System.out.println("map.values() : " + map.values());
		System.out.println();

		System.out.println("map.pollFirstEntry() : " + map.pollFirstEntry());
		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.pollLastEntry() : " + map.pollLastEntry());
		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.remove(4) : " + map.remove(4));
		System.out.println("map : " + map);
		System.out.println();

		System.out.println("map.clear();");
		map.clear();
		System.out.println();

		System.out.println("map : " + map);
		System.out.println();
	}
}