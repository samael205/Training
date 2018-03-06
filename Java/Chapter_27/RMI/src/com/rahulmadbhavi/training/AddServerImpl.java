
package com.rahulmadbhavi.training;

import java.rmi.*;
import java.rmi.server.*;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{
	public AddServerImpl() throws RemoteException
	{

	}

	public double add(double num1, double num2)
	{
		return (num1 + num2);
	}
}