public class ControlTower implements Mediator {
    private boolean inUse;
    
	public synchronized boolean getPermission(){
        if(inUse){
            return false;
        }else{
            inUse=true;
            return true;
        }
    }

	public void land(Airplane airplane) throws InterruptedException{
        int num=airplane.getNumber();
        System.out.println("\n"+num+"¹ø ºñÇà±â Âø·ú ½ÃÀÛ");
        Thread.sleep(20);
        System.out.println(num+"¹ø ºñÇà±â Âø·ú ³¡");
        inUse=false;
    }
}
