package home;

import productManagement.AddProductViewer;
import userManagement.AddUserViewer;

public class HomeScreenController {
	
	
	
	public void addUserClicked() {
		AddUserViewer.addUserClickButton();
		
	}
	
	public void addProductClicked() {
		AddProductViewer.addProductClickedButton();
	}
	
	public void exitHomeScreenClicked() {
		System.out.println("Exiting Home Screen");
		
		
	}

}
