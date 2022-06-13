package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {

	
 static	Logger logger = LogManager.getLogger(Log4j2.class);
	
	public static void main(String[] args) {
		System.err.println("Hello");
		
		logger.info("Informational");
		logger.warn("warning");
		logger.fatal("fatal");
	}
	
	
}
