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
                System.out.println("   "+number+"�� ° ����� ��� ��...");
                Thread.sleep(10);
            }
            tower.land(this);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
