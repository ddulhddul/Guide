class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator (IWindow decoratedWindow) {
        super(decoratedWindow);
    }
 
    public void draw() {
        decoratedWindow.draw();
        drawHorizontalScrollBar();
    }
 
    private void drawHorizontalScrollBar() {
        // draw the horizontal scrollbar
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including horizontal scrollbars";
    }
}