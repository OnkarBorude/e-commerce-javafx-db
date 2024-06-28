package user_management;

import home.HomeScreenView;


public class UserManagementController {
	
	public void adduserclickedbutt() {
		UserManagementViewer.addUserClickButton();
	}
	
	public void updateUserClickeds() {
		UserManagementViewer.updateUserShow();
	}
	
	public void searchUserClicked() {
		UserManagementViewer.searchUserShow();
	}
	
	public void deleteUserClicked() {
		UserManagementViewer.deleteUserShow();
	}
	
	public void exitUserManagement() {
		HomeScreenView.show();
	}

}
