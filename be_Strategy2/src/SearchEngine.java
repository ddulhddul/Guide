import java.util.*;

public class SearchEngine {
	private String sort;

	public SearchEngine(String sort) {
		this.sort = sort;
	}
	public List<Object> search() {
		List<Object> list = new ArrayList<Object>(); //perform search
		
		if(sort.equals("Quick")){
			// quick sort logic
			System.out.println("Quick Sort");
		}else if(sort.equals("Merge")){
			// merge sort logic
			System.out.println("Merge Sort");
		}else if(sort.equals("Bubble")){
			// bubble sort logic
			System.out.println("Bubble Sort");
		}
		
		return list;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
}

