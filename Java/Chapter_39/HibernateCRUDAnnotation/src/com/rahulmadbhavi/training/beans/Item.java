
package com.rahulmadbhavi.training.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item
{
	@Id
	@Column(name = "itemcode")
	private int		itemCode;

	@Column(name = "itemname", length = 15)
	private String	itemName;

	@Column(name = "quantity")
	private int		quantity;

	@Column(name = "procuredate")
	private Date	procureDate;

	@Column(name = "unitprice", columnDefinition = "Decimal(10,2)")
	private double	unitPrice;

	// Getters
	public int getItemCode()
	{
		return itemCode;
	}

	public String getItemName()
	{
		return itemName;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public Date getProcureDate()
	{
		return procureDate;
	}

	public double getUnitPrice()
	{
		return unitPrice;
	}

	// Setters
	public void setItemCode(int itemCode)
	{
		this.itemCode = itemCode;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public void setProcureDate(Date procureDate)
	{
		this.procureDate = procureDate;
	}

	public void setUnitPrice(double unitPrice)
	{
		this.unitPrice = unitPrice;
	}
}
