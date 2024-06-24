package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBUtil;
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
	
	public void loginButtonClicked() throws SQLException {
		
		String username=userName.getText();
		String passwords=password.getText();
		
		String selectQuery="select * from user where first_name= '"+username+"' && password='"+passwords+"' ";
		ResultSet resultset=DBUtil.selectQuery(selectQuery);
		if(resultset.next()) {
			errorMessege.setText("Login Successfully !!");
			errorMessege.setTextFill(Color.GREEN);
		}
		else {
			errorMessege.setText("Login Failed!!");
			errorMessege.setTextFill(Color.RED);
		}
		
	}

}
