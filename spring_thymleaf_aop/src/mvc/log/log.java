package mvc.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class log {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	public void testprint() {
		//System.out.println("aop>>test log print");
		logger.debug("aop>>test log print");
	}
}
