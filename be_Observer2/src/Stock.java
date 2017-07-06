import java.util.*;

//1. extends Observable
public class Stock{
	private String owner;
	private String name;
	private double price;

	public Stock(String owner, String name, int price) {
		System.out.println("Creating stock " + owner);
		this.owner = owner;
		this.name = name;
		this.price = price;

		new PriceChanger(this).start();
		System.out.println("Stock " + owner + " created");
	}

	// The Ticker and Name are read-only. Only the price can change
	public String getTicker() {
		return owner;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) throws Exception {
		if (price >= 0) {
			this.price = price;
			//2.Observable 오브젝트를 변경한 것으로 marking합니다.
		
			
			//3.모든 옵저버에 그것을 통지

		} else {
			throw new Exception("Invalid price");
		}
	}
}
