package secured;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.lang.PackageName;

import frontend.Bulletins;

public class SecureApp extends WebApplication {

	@Override
	public Class<? extends SecurePage> getHomePage()
	{
		return Bulletins.class;
	}

	@Override protected void init() {
		super.init();
		//mount( "web", PackageName.forClass(SecurePage.class));
	}

}