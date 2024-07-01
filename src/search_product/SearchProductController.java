package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_management.ProductManagement;


public class SearchProductController {
	@FXML
	TextField searchName;
	
	@FXML
	Label  searchserrorMsg;
	
	@FXML
	TextField pname;
	
	@FXML
	TextField pprice;
	
	@FXML
	TextField pquantity;

	public void searchproductClicked() throws SQLException {
		String pnames=searchName.getText();
		String searchQuery="select * from product where product_name='"+pnames+"'";
		ResultSet resultSet=DBUtil.selectQuery(searchQuery);
		if(resultSet.next()) {
			pname.setText(resultSet.getString(1));
			pquantity.setText(resultSet.getString(2));
			pprice.setText(resultSet.getString(3));
			
			
		}
		else {
			searchserrorMsg.setText("Product Not Found!!");
		}
	}
	
	public void backButton() {
		new ProductManagement().show();
	}

}
