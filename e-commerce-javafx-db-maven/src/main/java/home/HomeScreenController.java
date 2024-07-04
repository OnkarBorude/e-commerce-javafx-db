package home;

import login.LoginScreen;
import product_management.ProductManagement;
import user_management.UserManagement;


public class HomeScreenController {
	public void addUserClicked() {
		new UserManagement().show();
		
	}
	
	public void addProductClicked() {
		new ProductManagement().show();
	}
	
	public void exitHomeScreenClicked() {
	   new LoginScreen().show();
	}

}
