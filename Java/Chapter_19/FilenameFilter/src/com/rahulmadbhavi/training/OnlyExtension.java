
package com.rahulmadbhavi.training;

import java.io.*;

class OnlyExtension implements FilenameFilter
{
	String ext;

	public OnlyExtension(String ext)
	{
		this.ext = "." + ext;
	}

	public boolean accept(File dir, String name)
	{
		return name.endsWith(ext);
	}
}