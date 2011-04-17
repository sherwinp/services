package frontend;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.lang.PackageName;

public class App extends WebApplication {

	@Override
	public Class<? extends BasePage> getHomePage()
	{
	return HomePage.class;
	}

	@Override protected void init() {
		super.init();
		//mount( "web", PackageName.forClass(BasePage.class));
	}

}
