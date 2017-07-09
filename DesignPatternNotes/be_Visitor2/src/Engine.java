public class Engine implements Element{
    public Engine() {
//        System.out.println("Engine()");
    }
    
    public void accept(Visitor visitor){
    	visitor.visit(this);
    }
}