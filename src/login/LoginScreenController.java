package login;

import java.sql.ResultSet;

import common.DBUtil;
import home.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {
	@FXML
	TextField userName;
	
	@FXML
	TextField password;
	
	@FXML
	Label errorMessege;
	
	public void loginButtonClicked() throws Exception {
		
		String username=userName.getText();
		String passwords=password.getText();
		
		String selectQuery="select * from user where first_name= '"+username+"' && password='"+passwords+"' ";
		ResultSet resultset=DBUtil.selectQuery(selectQuery);
		if(resultset.next()) {
			new HomeScreen().show();
		}
		else {
			errorMessege.setText("Login Failed!!");
			errorMessege.setTextFill(Color.RED);
		}
		
	}

}
