package testngex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

public class logimplemenattion {

	public static Logger log= (Logger) LogManager.getLogger(logimplemenattion.class);
	
	@Test
	public void text()
	{
		
		log.info("hello2");
	}
	@Test
	public void tex2t()
	{
		
		
		log.info("hello2");
	}
}
