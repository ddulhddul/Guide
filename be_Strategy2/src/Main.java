public class Main{
	public static void main(String[] args){
		SearchEngine cse=null;

		cse=new SearchEngine("Quick");
		cse.search();
		
		System.out.println();
		
		cse.setSort("Merge");
		cse.search();
		
		System.out.println();
		
		cse=new SearchEngine("Bubble");
		cse.search();
	}
}