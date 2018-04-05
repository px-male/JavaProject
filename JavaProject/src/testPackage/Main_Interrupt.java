package testPackage;

public class Main_Interrupt {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MultiThread_Interrupt mti = new MultiThread_Interrupt();
		mti.start();
		for(int j = 0; j < 3; j++) {
			try {
				long start = System.currentTimeMillis();
				System.out.println("スレッド１の" + (j + 1) + "番目の処理");
				Thread.sleep(1000);
				System.out.println("スレッド２の中断発生");
				mti.interrupt();
				long stop = System.currentTimeMillis();
				System.out.println("Time:" + (stop - start) + "[ms]");
			} catch(InterruptedException e) {
			    e.printStackTrace();
			}
		}
	}
}

class MultiThread_Interrupt extends Thread {
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("スレッド２の" + (i + 1) + "番目の処理" );
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
