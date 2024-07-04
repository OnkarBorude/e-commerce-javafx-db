package delete_user;

import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import user_management.UserManagement;

public class DeleteUserController {

	@FXML
	TextField deleteName;
	
	@FXML
	Label deleteerrorMsg;
	
	public void deleteButtonClicked() throws SQLException {
		String deleteNames=deleteName.getText();
		String deleteQuery="delete from user where first_name='"+deleteNames+"'";
		DBUtil.executeQuery(deleteQuery);
		deleteerrorMsg.setText("User Deleted Successfully!!");
	}
	
	public void backButton() {
		new UserManagement().show();
	}

}
