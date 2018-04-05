package gate;

public class Close implements State {

	private String name_ = "Close";
	private static State instance_ = new Close();
	
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
		
		if (ctx.validate(evt)) {
			ctx.unlock();
			return Open.instance();
		} else {
			ctx.eject();
			return Close.instance();
		}
	}

	@Override
	public State handle(Pass evt, Context ctx) {
		// TODO 自動生成されたメソッド・スタブ
		ctx.alart();
		return Close.instance();
	}
}
