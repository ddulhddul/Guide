abstract class WindowDecorator implements IWindow {
    protected IWindow decoratedWindow; // the Window being decorated
 
    public WindowDecorator (IWindow decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
    public void draw() {
        decoratedWindow.draw();
    }
}
