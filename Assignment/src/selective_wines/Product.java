package selective_wines;

import java.io.*;

public class Product implements Serializable
{
	
	String productID, name, colour, region, country, grape;
	int noSold, stockLevel, count = 10000;
	double cost, sellingPrice;
	
	public Product(String productID, String name, String colour, String region, String country, String grape,
			int noSold, int stockLevel, double cost, double sellingPrice) 
	{
		this.productID = productID;
		this.name = name;
		this.colour = colour;
		this.region = region;
		this.country = country;
		this.grape = grape;
		this.noSold = noSold;
		this.stockLevel = stockLevel;
		this.cost = cost;
		this.sellingPrice = sellingPrice;
	}
	
	public Product() 
	{
		this.productID = Integer.toString(count);
		this.name = "";
		this.colour = "";
		this.region = "";
		this.country = "";
		this.grape = "";
		this.noSold = 0;
		this.stockLevel = 0;
		this.cost = 0;
		this.sellingPrice = 0;
		count++;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Validation 
	{
		if (name.length() < 7 || name.length()>30) // Validates name to between 7 - 30 Characters
		{
			throw new Validation("Name must be between 7 and 30 characters");
		}
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getReigon() {
		return region;
	}

	public void setReigon(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGrape() {
		return grape;
	}

	public void setGrape(String grape) {
		this.grape = grape;
	}

	public int getNoSold() {
		return noSold;
	}

	public void setNoSold(int noSold) {
		this.noSold = noSold;
	}

	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel)throws Validation 
	{
		if (stockLevel < 1 || stockLevel > 30 ) // Validates Stock so there is at least 1 and no more than 30 when product is added or updated
		{
			throw new Validation("Stock added must be between 1 & 30");
		}
		this.stockLevel = stockLevel;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) throws Validation 
	{
		if (cost < 5.00 || cost > 150.00 ) // Validates cost to make it between £5 and £150
		{
			throw new Validation("Cost must be between £5 & £150");
		}
		this.cost = cost;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice)throws Validation 
	{
		if (sellingPrice < 10.00 || sellingPrice > 300.00 ) // Validates sellingPrice to make it between £10 and £300
		{
			throw new Validation("Selling Price must be between £10 & £300");
		}
		this.sellingPrice = sellingPrice;
	}

	
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", colour=" + colour + ", reigon=" + region
				+ ", country=" + country + ", grape=" + grape + ", noSold=" + noSold + ", stockLevel=" + stockLevel
				+ ", cost=" + cost + ", sellingPrice=" + sellingPrice + "]";
	}
	
	

}
