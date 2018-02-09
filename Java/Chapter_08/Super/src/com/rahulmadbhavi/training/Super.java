
package com.rahulmadbhavi.training;

class Super
{
	public static void main(String args[])
	{
		BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight myBox3 = new BoxWeight();
		BoxWeight myBox4 = new BoxWeight(3, 2);
		BoxWeight myClone = new BoxWeight(myBox1);

		double vol;

		vol = myBox1.volume();
		System.out.println("Volume of myBox1 " + vol);
		System.out.println("Weight of myBox1 " + myBox1.weight);		
		System.out.println();
		
		vol = myBox2.volume();
		System.out.println("Volume of myBox2 " + vol);
		System.out.println("Weight of myBox2 " + myBox2.weight);		
		System.out.println();

		vol = myBox3.volume();
		System.out.println("Volume of myBox3 " + vol);
		System.out.println("Weight of myBox3 " + myBox3.weight);		
		System.out.println();

		vol = myBox4.volume();
		System.out.println("Volume of myBox4 " + vol);
		System.out.println("Weight of myBox4 " + myBox4.weight);		
		System.out.println();

		vol = myClone.volume();
		System.out.println("Volume of myClone " + vol);
		System.out.println("Weight of myClone " + myClone.weight);		
		System.out.println();
	}
}