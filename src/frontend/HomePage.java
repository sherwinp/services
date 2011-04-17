package frontend;

import java.util.Date;

import org.apache.wicket.markup.html.link.*;


public class HomePage extends BasePage{
    @SuppressWarnings("deprecation")
	public HomePage() {
    	    	
    	add(new PageLink("loginLink", Login.class ));
    	add(new PageLink("registerLink", Login.class ));
    	add(new PageLink("bulletinsLink", Bulletins.class ));
		
    }	
    
    
}
