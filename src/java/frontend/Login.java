package frontend;

import java.util.Date;

import org.apache.wicket.PageParameters;
import org.apache.wicket.Response;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.pages.RedirectPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.target.basic.RedirectRequestTarget;

import org.apache.wicket.Request;
import org.apache.wicket.authentication.AuthenticatedWebSession;
import org.apache.wicket.authorization.strategies.role.Roles;


public class Login extends BasePage {
  private TextField<String> userIdField;
  private PasswordTextField passField;
  private Form form;

    public Login() {    
    	/**
    	 * The first parameter to all Wicket component constructors is
    	 * the same as the ID that is used in the template
    	 */
    	final Date firstVisitTime = new Date();
	    	
    	    userIdField = new TextField<String>("userId", new Model<String>(""));
    	    passField = new PasswordTextField("password", new Model<String>(""));

    	    /* Make sure that password field shows up during page re-render **/

    	    passField.setResetPassword(false);

    	    form = new LoginForm("loginForm");
    	    form.add(userIdField);
    	    form.add(passField);
    	    add(form);
    }
    
    public Login(PageParameters parameters) {
     super(parameters);
    }
 // Define your LoginForm and override onSubmit
    class LoginForm extends Form {
      public LoginForm(String id) {
        super(id);
      }
      @Override
      public void onSubmit() {
        String userId = Login.this.userIdField.getDefaultModelObjectAsString();
        String password = Login.this.passField.getDefaultModelObjectAsString();
        System.out.println("You entered User id " + userId + " and Password " + password);
       
        getRequestCycle().setRequestTarget(new RedirectRequestTarget("secured"));

      }
    }	
	
}