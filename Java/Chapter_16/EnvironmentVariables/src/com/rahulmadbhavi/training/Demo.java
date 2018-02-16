
package com.rahulmadbhavi.training;

import java.util.Properties;

class Demo
{
	public static void main(String args[])
	{
		String keys[] =
		{
			"file.separator",
			"java.class.path",
			"java.class.version",
			"java.compiler",
			"java.ext.dirs",
			"java.home",
			"java.io.tmpdir",
			"java.library.path",
			"java.specification.name",
			"java.specification.vendor",
			"java.specification.version",
			"java.vendor",
			"java.vendor.url",
			"java.version",
			"java.vm.name",
			"java.vm.specification.name",
			"java.vm.specification.vendor",
			"java.vm.specification.version",
			"java.vm.vendor",
			"java.vm.version",
			"line.separator",
			"os.arch",
			"os.name",
			"os.version",
			"path.separator",
			"user.dir",
			"user.home",
			"user.name"
		};

		String value;

		for(String key : keys)
		{
			value = System.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
}