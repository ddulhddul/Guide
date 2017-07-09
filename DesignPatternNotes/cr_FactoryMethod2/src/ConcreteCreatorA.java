public class ConcreteCreatorA extends Creator {

    public Trans create(String type){
        if("leisure".equals(type)){
        	return new Bicycle();
        }else if("busy".equals(type)){
        	return new Taxi();
        }else{
        	return new Bus();
        }
    }

}
