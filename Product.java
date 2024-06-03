package com.springProject.constructor;

public class Product 
{
	private int productId;
	private String name;
	private int price;
	private int rating;
	private String BID;
	public Product(int productId, String name, int price, int rating, String bID)
	{
	
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.BID = bID;
	}
    public void print()
    {
    	System.out.println("productID: "+productId+"\n"+"ProductName: "+name+"\n"+"Product Price: "+price+"\n"+"Rating of Product: "+rating+"\n"+"Brand ID: "+BID);
    }
}
