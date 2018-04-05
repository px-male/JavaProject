package gate;

public interface Context {
	public void lock();
	public void unlock();
	void eject();
	void alart();
	boolean validate(Coin evt);
}
