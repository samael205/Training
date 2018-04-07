
package com.rahulmadbhavi.training.daos;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import com.rahulmadbhavi.training.beans.Item;
import com.rahulmadbhavi.training.utility.CommonScanner;
import com.rahulmadbhavi.training.utility.HibernateSessionFactory;

public class ItemDAO
{
	public void insert()
	{
		// Get scanner object
		Scanner scanner = CommonScanner.getScanner();

		// Get Inputs
		System.out.print("Item Code : ");
		int itemCode = scanner.nextInt();

		System.out.print("Item Name : ");
		String itemName = scanner.next();

		System.out.print("Quantity : ");
		int quantity = scanner.nextInt();

		System.out.print("Price : ");
		double price = scanner.nextDouble();

		System.out.print("Procurement Date (yyyy-mm-dd) : ");
		String jDate = scanner.next();

		// Generate Item Bean
		Item item = new Item();
		item.setItemCode(itemCode);
		item.setItemName(itemName);
		item.setQuantity(quantity);
		item.setUnitPrice(price);
		Date procDate = Date.valueOf(jDate);
		item.setProcureDate(procDate);

		// Insert to table
		Session session = HibernateSessionFactory.getSessionFactory().openSession();

		session.beginTransaction();
		session.save(item);
		session.getTransaction().commit();

		session.close();
	}

	public void update()
	{
		// Get Scanner object
		Scanner scanner = CommonScanner.getScanner();

		// Get Item code.
		System.out.print("Item Code : ");
		int itemCode = scanner.nextInt();

		// Create session
		Session session = HibernateSessionFactory.getSessionFactory().openSession();

		session.beginTransaction();
		Item item = (Item) session.get(Item.class, itemCode);

		System.out.println("Item Code : " + item.getItemCode());
		System.out.println("Item Name : " + item.getItemName());
		System.out.println("Quantity : " + item.getQuantity());
		System.out.println("Unit Price : " + item.getUnitPrice());
		System.out.println("Procurement Date : " + item.getProcureDate());

		System.out.print("\nEnter New Quantity : ");
		int quantity = scanner.nextInt();
		item.setQuantity(quantity);

		System.out.print("Enter New Unit Price : ");
		double price = scanner.nextDouble();
		item.setUnitPrice(price);

		session.saveOrUpdate(item);
		session.getTransaction().commit();

		session.close();
	}

	public void delete()
	{
		// Create Session
		Session session = HibernateSessionFactory.getSessionFactory().openSession();

		// Get Scanner
		Scanner scanner = CommonScanner.getScanner();

		System.out.print("Item Code : ");
		int itemCode = scanner.nextInt();

		Item item = new Item();

		item.setItemCode(itemCode);

		session.beginTransaction();
		session.delete(item);
		session.getTransaction().commit();

		session.close();
	}

	public Item selectOne()
	{
		Item item = null;

		// Get Session
		Session session = HibernateSessionFactory.getSessionFactory().openSession();

		// Get Scanner
		Scanner scanner = CommonScanner.getScanner();

		System.out.print("Item Code : ");
		int itemCode = scanner.nextInt();

		item = (Item) session.get(Item.class, itemCode);

		System.out.println("Item Code : " + item.getItemCode());
		System.out.println("Item Name : " + item.getItemName());
		System.out.println("Quantity : " + item.getQuantity());
		System.out.println("Unit Price : " + item.getUnitPrice());
		System.out.println("Procurement Date : " + item.getProcureDate());

		session.close();

		return item;
	}

	public List<Item> selectAll()
	{
		// Get Session
		Session session = HibernateSessionFactory.getSessionFactory().openSession();

		@SuppressWarnings("unchecked")
		List<Item> list = (List<Item>) session.createCriteria(Item.class).list();

		for(Iterator<Item> iterator = list.iterator(); iterator.hasNext();)
		{
			Item item = (Item) iterator.next();

			System.out.println("-----------------------");
			System.out.println("Item Code : " + item.getItemCode());
			System.out.println("Item Name : " + item.getItemName());
			System.out.println("Quantity : " + item.getQuantity());
			System.out.println("Unit Price : " + item.getUnitPrice());
			System.out.println("Procurement Date : " + item.getProcureDate());
		}

		session.close();
		return list;
	}
}
