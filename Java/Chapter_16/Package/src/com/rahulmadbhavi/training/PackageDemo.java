
package com.rahulmadbhavi.training;

class PackageDemo
{
	public static void main(String args[])
	{
		Package packages[];

		packages = Package.getPackages();

		for(int i=0; i<packages.length; i++)
		{
			System.out.println(
									packages[i].getName() + " " +
									packages[i].getImplementationTitle() + " " + 
									packages[i].getImplementationVendor() + " " + 
									packages[i].getImplementationVersion()

							  );
		}
	}
}