package fourJTwo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	 final static Logger logger = LogManager.getLogger(App.class);
	    public static void main( String[] args )
	    {
	       System.out.println("created");
	         
	         logger.debug("Debug Message Logged");
	         logger.info("info Message Logged");
	         logger.warn("warn Message Logged");
	         logger.error("error Message Logged");
	         logger.fatal("fatal Message Logged");
	    }
}
