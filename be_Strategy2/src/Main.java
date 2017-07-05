public class Main{
	public static void main(String[] args){
		SearchEngine cse=null;

//		cse=new SearchEngine("Quick");
		cse=new SearchEngine(new Quick());
		cse.search();
		
		System.out.println();
		
//		cse.setSort("Merge");
		cse.setStrategy(new Merge());
		cse.search();
		
		System.out.println();
		
//		cse=new SearchEngine("Bubble");
		cse=new SearchEngine(new Bubble());
		cse.search();
	}
}