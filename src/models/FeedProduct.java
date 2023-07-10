package models;

import java.time.LocalDate;

public class FeedProduct {

	private int feedProductId;
	private String title;
	private int quantity;
	private LocalDate expiryDate;
	
	private static int idCounter = 100;

	public int getFeedProductId() {
		return feedProductId;
	}

	public String getTitle() {
		return title;
	}

	public int getQuantity() {
		return quantity;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setFeedProductId() {
		this.feedProductId = idCounter;
		idCounter++;
	}

	public void setTitle(String title) {
		
		if (title != null && title.matches("[a-zçûîâðìíïòèþ]+"))
		{
			this.title = title;
		}
		else 
		{
			this.title = "unknown";
		}
	}

	public void setQuantity(int quantity) {
		
		if (quantity != 0 && quantity > 0 && quantity < 100)
		{
			this.quantity = quantity;
		}
		else
		{
			this.quantity = 0;
		}
	}

	public void setExpiryDate(LocalDate expiryDate) {
		
		if (expiryDate != null && expiryDate.isAfter(LocalDate.now()))
		{
			this.expiryDate = expiryDate;
		}
		else
		{
			this.expiryDate = null;
		}
	}
	
	public FeedProduct()
	{
		setFeedProductId();
		setTitle("Test");
		setQuantity(1);
		setExpiryDate(null);
	}
	
	public FeedProduct (String title, int quantity, LocalDate expiryDate)
	{
		setTitle(title);
		setQuantity(quantity);
		setExpiryDate(expiryDate);
	}

	@Override
	public String toString() {
		return "FeedProduct [feedProductId=" + feedProductId + ", title=" + title + ", quantity=" + quantity
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
	
	

	
	
	
	
}
