public class Body implements Element{
    public Body() {
//        System.out.println("Body()");
    }
    
    public void accept(Visitor visitor){
    	visitor.visit(this);
    }
}