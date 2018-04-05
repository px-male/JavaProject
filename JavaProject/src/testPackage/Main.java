package testPackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MultiThread mt = new MultiThread();
		mt.start();
		for(int j = 0; j < 3; j++) {
			try {
				Thread.sleep(1000);
				System.out.println("スレッド１の" + (j + 1) + "番目の処理");
			} catch(InterruptedException e) {
			    e.printStackTrace();
			}
		}
	}
}

class MultiThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("スレッド２の" + (i + 1) + "番目の処理" );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
