package product_management;

import java.sql.SQLException;

import common.DBUtil;
import home.HomeScreenView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddProductController {
	
	@FXML
	TextField pname;
	
	@FXML
	TextField pquantity;
	
	@FXML
	TextField pprice;
	
	@FXML
	Label addProductErrorMsg;
	
	public void addProductClicked() throws SQLException {
		String pnames=pname.getText();
		String pquantities=pquantity.getText();
		String pprices=pprice.getText();
		
		String query="insert into product(product_name, product_quantity, product_price) values('"+pnames+"','"+pquantities+"','"+pprices+"')";
		DBUtil.executeQuery(query);
		addProductErrorMsg.setText("User Added Successfully");
		
	}
	
	public void backButton() {
		ProductManagementViewer.productmanageShow();
	}
		

}
