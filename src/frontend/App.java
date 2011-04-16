package frontend;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.Page;
public class App extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage()
	{
	return HomePage.class;
	}

	@Override protected void init() {
		super.init();
	}

}
