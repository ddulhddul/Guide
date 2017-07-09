public interface State {

    public void open();

    public void close();

    public void save();

    public void edit(String text);

}
