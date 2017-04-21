package au.id.mcmaster.spring.boot.starter.mule;

import org.mule.api.MuleContext;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class MuleComponent implements ApplicationContextAware
{
    private static final Logger log = LoggerFactory.getLogger(MuleComponent.class);

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
    	System.out.println("ApplicationContext: " + context);
    	
        DefaultMuleContextFactory muleContextFactory = new DefaultMuleContextFactory();
        SpringXmlConfigurationBuilder configBuilder = null;
        try {
        	StaticApplicationContext staticApplicationContext = new StaticApplicationContext(context);
            //ConfigResource configResource = new ConfigResource( );
            configBuilder = new SpringXmlConfigurationBuilder("mule-config.xml");
            staticApplicationContext.refresh();
            configBuilder.setParentContext(staticApplicationContext);
            MuleContext muleContext = muleContextFactory.createMuleContext(configBuilder);
            muleContext.start();
            log.info("Started Mule!");
        } catch (Exception e) {
            log.error("Error starting Mule...",e);
        }    	
	}
}
