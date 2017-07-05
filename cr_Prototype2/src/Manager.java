import java.util.*;

public class Manager {
	private Map<String, Product> cache 
		= new HashMap<String, Product>();

	public Manager(){
		R2d2 r = new R2d2("Luke Skywalker");
		C3po c = new C3po("Luke Skywalker");
		Droid d1 = new Droid("sniper");
		Droid d2 = new Droid("ranger");
		
		register("r2d2", r);
		register("c3po", c);
		register("sniper", d1);
		register("ranger", d2);
	}

	public void register(String name, Product proto) {
		cache.put(name, proto);
	}
	public Product create(String protoname) {
		Product p = (Product) cache.get(protoname);
		return p.createClone();
	}
}
