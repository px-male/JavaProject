package gate;

public interface State {
	public String name();
	public State handle(Coin evt, Context ctx);
	public State handle(Pass evt, Context ctx);
	
}
