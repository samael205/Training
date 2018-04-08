
package com.rahulmadbhavi.training;

public class Demo
{
	static <R, T> R myClassFactory(MyFunction<R, T> constructor, T v)
	{
		return constructor.function(v);
	}

	public static void main(String[] args)
	{
		MyFunction<MyClass<Double>, Double> myClassConstructor = MyClass<Double>::new;
		
		MyClass<Double> mc = myClassFactory(myClassConstructor, 100.1);
		
		System.out.println("Value in mc is  : " + mc.getVal());
		
		MyFunction<MyClass2, String> myClassConstructor2 = MyClass2::new;
		
		MyClass2 mc2 = myClassFactory(myClassConstructor2, "Lambda");
		
		System.out.println("Value in mc2 is : " + mc2.getVal());
	}
}
