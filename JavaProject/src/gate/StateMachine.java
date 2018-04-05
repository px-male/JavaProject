package gate;

public class StateMachine {
	
	private State state_;
	private Context ctx_;
	
	public StateMachine(State initial, Context ctx) {
		state_ = initial;
		ctx_ = ctx;
	}
	
	public String stateName() {
		return state_.name();
	}
	
	public void handle(Coin evt) {
		state_ = state_.handle(evt, ctx_);
	}
	
	public void handle(Pass evt) {
		state_ = state_.handle(evt, ctx_);
	}
	
	
	
}
