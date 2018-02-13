
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Bean rectangle = new Bean(3, 4);
		Bean square = new Bean(5);
		Bean blank = new Bean();

		rectangle.printDim();
		square.printDim();
		blank.printDim();
	}
}