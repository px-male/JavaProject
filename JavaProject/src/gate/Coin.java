package gate;

public class Coin {
	private boolean real_;
	public boolean isReal() {
		return real_;
	}
	
	// コンストラクタ
	public Coin() {real_ = true;}
	
	public Coin(boolean real) {
		this.real_ = real;
	}
}	
