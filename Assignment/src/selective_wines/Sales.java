package selective_wines;

import java.io.*;
import java.time.LocalDateTime;

public class Sales implements Serializable
{
	
	int saleID, noItems;
	String customerName;
	LocalDateTime date;
	double totalPrice;
	
	public Sales(int saleID, int noItems, String customerName, LocalDateTime date, double totalPrice) 
	{
		this.saleID = saleID;
		this.noItems = noItems;
		this.customerName = customerName;
		this.date = date;
		this.totalPrice = totalPrice;
	}

	public Sales() 
	{
		this.saleID = 0;
		this.noItems = 0;
		this.customerName = "";
		this.date = date.now();
		this.totalPrice = 0;
	}

	public int getSaleID() {
		return saleID;
	}

	public void setSaleID(int saleID) {
		this.saleID = saleID;
	}

	public int getNoItems() {
		return noItems;
	}

	public void setNoItems(int noItems) {
		this.noItems = noItems;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	public String toString() {
		return "Sales [saleID=" + saleID + ", noItems=" + noItems + ", customerName=" + customerName + ", date=" + date
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	
	
	

}
