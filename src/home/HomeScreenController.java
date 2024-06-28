package home;

import login.LoginScreenViewer;
import product_management.ProductManagementViewer;

import user_management.UserManagementViewer;


public class HomeScreenController {
	
	
	
	public void addUserClicked() {
		UserManagementViewer.userManageShow();
		
	}
	
	public void addProductClicked() {
		ProductManagementViewer.productmanageShow();
	}
	
	public void exitHomeScreenClicked() {
		LoginScreenViewer.show();
	}

}
