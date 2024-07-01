package user_management;

import add_user.AddUser;
import delete_user.DeleteUser;
import home.HomeScreen;
import search_user.SearchUser;
import update_user.UpdateUser;

public class UserManagementController {
	public void adduserclickedbutt() {
		new AddUser().show();
	}
	
	public void updateUserClickeds() {
		new UpdateUser().show();

	}
	
	public void searchUserClicked() {
		new SearchUser().show();

	}
	
	public void deleteUserClicked() {
		new DeleteUser().show();

	}
	
	public void exitUserManagement() {
		new HomeScreen().show();

	}

}
