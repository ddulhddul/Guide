public class Proxy implements IPrintable {
    private Printer real;
    private String name;

    public Proxy(String name){
    	this.name = name;
    }

    public void setPrinterName(String name){
    	this.name = name;
    	if(real != null) real.setPrinterName(name);
    }

    public String getPrinterName(){
        return name;
    }

    public void print(String msg){
    	if(real == null) real = new Printer(name);
    	real.print(msg);
    }

}
