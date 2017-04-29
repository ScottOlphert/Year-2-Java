package selective_wines;

public class Product 
{
	
	String productID, name, colour, reigon, country, grape;
	int noSold, stockLevel;
	double cost, sellingPrice;
	
	public Product(String productID, String name, String colour, String reigon, String country, String grape,
			int noSold, int stockLevel, double cost, double sellingPrice) 
	{
		this.productID = productID;
		this.name = name;
		this.colour = colour;
		this.reigon = reigon;
		this.country = country;
		this.grape = grape;
		this.noSold = noSold;
		this.stockLevel = stockLevel;
		this.cost = cost;
		this.sellingPrice = sellingPrice;
	}
	
	public Product() 
	{
		super();
		this.productID = "";
		this.name = "";
		this.colour = "";
		this.reigon = "";
		this.country = "";
		this.grape = "";
		this.noSold = 0;
		this.stockLevel = 0;
		this.cost = 0;
		this.sellingPrice = 0;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getReigon() {
		return reigon;
	}

	public void setReigon(String reigon) {
		this.reigon = reigon;
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

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", colour=" + colour + ", reigon=" + reigon
				+ ", country=" + country + ", grape=" + grape + ", noSold=" + noSold + ", stockLevel=" + stockLevel
				+ ", cost=" + cost + ", sellingPrice=" + sellingPrice + "]";
	}
	
	

}
