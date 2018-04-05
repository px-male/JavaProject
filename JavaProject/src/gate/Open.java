package gate;

public class Open implements State {

	private String name_ = "Open";
	private static Open instance_ = new Open();
	
	public static State instance() {
		return instance_;
	}
	
	@Override
	public String name() {
		return name_;
	}
	
	@Override
	public State handle(Coin evt, Context ctx) {
		// TODO 自動生成されたメソッド・スタブ
		ctx.eject();
		return Open.instance();
	}

	@Override
	public State handle(Pass evt, Context ctx) {
		// TODO 自動生成されたメソッド・スタブ
		ctx.lock();
		return Close.instance();
	}
	
}
