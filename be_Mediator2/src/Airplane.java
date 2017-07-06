public class Airplane extends Colleague implements Runnable {
    private final int number;

    public Airplane(Mediator tower, int number) {
        super(tower);
        this.number=number;
    }
    public int getNumber() {
        return number;
    }
    public void run() {
        try{
            while(!tower.getPermission()){
                System.out.println("   "+number+"번 째 비행기 대기 중...");
                Thread.sleep(10);
            }
            tower.land(this);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
