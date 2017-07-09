import java.util.*;

public class SearchEngine {
	private String sort;
	private Strategy strategy;

	public SearchEngine(String sort) {
		this.sort = sort;
	}
	public SearchEngine(Strategy strategy) {
		this.strategy= strategy;
	}
	public List<Object> search() {
		List<Object> list = new ArrayList<Object>(); //perform search
		
		strategy.sort(list);
		/*
		if(sort.equals("Quick")){
		}else if(sort.equals("Merge")){
		}else if(sort.equals("Bubble")){
		}
		*/
		
		return list;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy= strategy;
	}
}

