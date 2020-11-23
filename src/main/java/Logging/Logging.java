package Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {

	static Logger logger = LogManager.getLogger(Logging.class);

	public static void main(String[] args) {
		System.out.println("first");
		logger.info("info");
		logger.error("error");
		logger.warn("warning");
		logger.fatal("fatal message");
		System.out.println("second");
	}
}
