import java.util.*;

public class PriceChanger extends Thread {
	private Stock stock;
	private Random r = new Random();

	public PriceChanger(Stock stock) {
		this.stock = stock;
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(2000);
				if (r.nextInt() > 0)
					stock.setPrice(stock.getPrice() + 10);
				else
					stock.setPrice(stock.getPrice() - 10);
			}
		} catch (Exception e) {
			System.err.println("Error in thread " + e);
		}
	}
}
