package testPackage;

public class Thread_Runable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MultiThread_Runable mr = new MultiThread_Runable();
		Thread tr = new Thread(mr);
		tr.start();
		for(int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("スレッド１の" + (i + 1) + "番目の処理");

			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}

class MultiThread_Runable implements Runnable{

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