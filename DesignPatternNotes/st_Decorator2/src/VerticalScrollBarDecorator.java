class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator (IWindow decoratedWindow) {
        super(decoratedWindow);
    }
 
    public void draw() {
        decoratedWindow.draw();
        drawVerticalScrollBar();
    }
 
    private void drawVerticalScrollBar() {
        // draw the vertical scrollbar
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }
}