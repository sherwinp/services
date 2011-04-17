package frontend;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.lang.PackageName;

public class SecureApp extends WebApplication {

	@Override
	public Class<? extends BasePage> getHomePage()
	{
		boolean authenticated = false;
		if( authenticated ){
			return Bulletins.class;	
		}else{	
		    return Login.class;
		}
	}

	@Override protected void init() {
		super.init();
		mount( "web", PackageName.forClass(BasePage.class));
	}

}