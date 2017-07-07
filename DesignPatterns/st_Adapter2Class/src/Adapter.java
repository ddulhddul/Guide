public class Adapter extends StringBuilder implements IStringNewBuilder {

    public Adapter(String s){
    	super(s);
    }

    public String toString(){
        return "["+super.toString()+"]";
    }

    public void newMethod(){
    	System.out.println("new Method !!");
    }

}
