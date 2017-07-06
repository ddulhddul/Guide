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
			//2.Observable ������Ʈ�� ������ ������ marking�մϴ�.
		
			
			//3.��� �������� �װ��� ����

		} else {
			throw new Exception("Invalid price");
		}
	}
}
