public class Director {
    private Builder builder;

    public Director(Builder builder){
    	this.builder = builder;
    }

    public void buildVehicle() {
		builder.create();
		builder.build();
		builder.attach();
		builder.test();
		builder.output();
	}

}
