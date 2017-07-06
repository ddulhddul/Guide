public interface Mediator {
	public abstract boolean getPermission();
	public abstract void land(Airplane airplane) throws InterruptedException;
}