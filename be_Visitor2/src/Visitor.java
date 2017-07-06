public interface Visitor {

    public void visit(Body body);

    public void visit(Engine engine);

    public void visit(Wheel wheel);

    public void visit(Car car);

}
