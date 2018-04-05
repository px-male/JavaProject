package gate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Parking {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		ConsoleContext cc = new ConsoleContext();
		
		StateMachine machine = new StateMachine(Close.instance(), cc);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		boolean bool = false;
		
		while(!bool) {
			System.out.printf("%s: coin / fake / pass or exit ? ->", machine.stateName());
			String choice = reader.readLine();

			switch(choice) {
			
			case "coin":
				machine.handle(new Coin());
				break;
			
			case "fake":
				machine.handle(new Coin(false));
				break;
			case "pass":
				machine.handle(new Pass());
				break;
			
			case "exit":
				bool = true;
				break;
			}
		}
		System.out.println("お疲れ様でした");
		
	}

}


final class ConsoleContext implements Context {

	@Override
	public void lock() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("またのお越しを");
	}

	@Override
	public void unlock() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ゲートを開けました");
	}

	@Override
	public void eject() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("お金をへんきゃくします");
	}

	@Override
	public void alart() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("この～っ！");
	}
	
	@Override
	public boolean validate(Coin evt) {
		if(evt.isReal()) {
			return true;
		} else {
			return false;
		}
		
	}
}