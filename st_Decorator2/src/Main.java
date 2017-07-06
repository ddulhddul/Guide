public class Main {
	public static void main(String[] args) {
        // create a decorated Window with horizontal and vertical scrollbars
        IWindow decoratedWindow = 
    		new VerticalScrollBarDecorator(
				new HorizontalScrollBarDecorator (
                	new SimpleWindow()
                )
            );
 
        // print the Window's description
        System.out.println(decoratedWindow.getDescription());
    }
}
