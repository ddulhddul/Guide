public class Car implements Element{
    private Element[] elements;
 
    public Element[] getElements() {
        return elements.clone(); // Return a copy of the array of references.
    }
 
    public Car() {
        elements = new Element[]{
        	new Wheel("front left"), new Wheel("front right"),
            new Wheel("back left") , new Wheel("back right"),
            new Body(), new Engine() 
        };
    }
}