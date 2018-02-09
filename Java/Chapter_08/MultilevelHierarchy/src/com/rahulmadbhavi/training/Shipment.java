
package com.rahulmadbhavi.training;

class Shipment extends BoxWeight
{
	double cost;

	Shipment()
	{
		super();
		this.cost = -1;
	}

	Shipment(Shipment shipment)
	{
		super(shipment);
		this.cost = shipment.cost;
	}

	Shipment(double width, double depth, double height, double weight, double cost)
	{
		super(width, depth, height, weight);
		this.cost = cost;
	}

	Shipment(double length, double weight, double cost)
	{
		super(length, weight);
		this.cost = cost;
	}
}