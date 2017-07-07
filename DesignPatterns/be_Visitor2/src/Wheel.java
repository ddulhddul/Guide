public class Wheel implements Element{
    private String name;
 
    public Wheel(String name) {
        this.name = name;
//        System.out.println("Wheel("+name+")");
    }
 
    public String getName() {
        return name;
    }
    
    public void accept(Visitor visitor){
    	visitor.visit(this);
    }
}