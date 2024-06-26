package userManagement;

import java.sql.SQLException;

import common.DBUtil;
import home.HomeScreenView;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddUserController {
	@FXML
	TextField fname;
	
	@FXML
	TextField lname;
	
	@FXML
	TextField gender;
	
	@FXML
	TextField age;
	
	@FXML
	TextField email;
	
	@FXML
	TextField password;
	
	@FXML
	TextField rePassword;
	
	public void submitUserClicked() throws SQLException {
		String fnames=fname.getText();
		String lnames=lname.getText();
		String genders=gender.getText();
		String ages=age.getText();
		String emails=email.getText();
		String passwords=password.getText();
		String repasswords=rePassword.getText();
		if(passwords.equals(repasswords)) {
			
			String query="insert into user(first_name, last_name, gender, age, email, password) values('"+fnames+"','"+lnames+"','"+genders+"','"+ages+"','"+emails+"','"+passwords+"')";
			DBUtil.executeQuery(query);
			System.out.println("User Added Successfully!!");
		}
		else {
			System.out.println("User Additon Failed");
		}
		HomeScreenView.show();
	}
	
	
	
	
}
