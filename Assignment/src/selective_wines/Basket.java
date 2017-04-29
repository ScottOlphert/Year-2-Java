package selective_wines;

public class Basket 
{

	String productID;
	int quantity;
	
	public Basket(String productID, int quantity) 
	{
		this.productID = productID;
		this.quantity = quantity;
	}
	
	public Basket() 
	{	
		this.productID = "";
		this.quantity = 0;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "Basket [productID=" + productID + ", quantity=" + quantity + "]";
	}
		
}
