package testPackage;

public class Thread_Runable_join {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MultiThread_Runable_join mrj = new MultiThread_Runable_join();
		Thread tr = new Thread(mrj);

		tr.start();

		for(int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("スレッド１の" + (i + 1) + "番目の処理");

				System.out.println("別スレッドの処理を待機");
				tr.join();
				System.out.println("別スレッドの処理を終了");
			
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}

class MultiThread_Runable_join implements Runnable{

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("スレッド２の" + (i + 1) + "番目の処理");
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
		}
		
	}
	
}