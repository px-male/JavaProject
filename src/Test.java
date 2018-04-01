
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("test");		
		
		Sample samp = new Sample();
		samp.runSample();
		
	}

}


class Sample {
	private Logger logger = LogManager.getLogger();
	
	void runSample() {
		logger.trace("Start");
		int a = 1;
		int b = 2;
		String c = null;
		
		logger.debug("debug");
		logger.info("info={}", a);
		logger.warn("worn={},={}",a,b);
		logger.error("error={}",c);
		
		logger.trace("End");
		
		
		
		
	}
	
	
}