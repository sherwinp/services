package frontend;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;


public class Login extends BasePage {
  private TextField userIdField;
  private PasswordTextField passField;
  private Form form;

    public Login() {    
    	/**
    	 * The first parameter to all Wicket component constructors is
    	 * the same as the ID that is used in the template
    	 */

    	    userIdField = new TextField<String>("userId", new Model(""));
    	    passField = new PasswordTextField("password", new Model(""));

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
        
      }
    }	
	
}