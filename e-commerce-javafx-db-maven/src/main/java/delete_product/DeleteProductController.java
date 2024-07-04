package delete_product;

import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_management.ProductManagement;

public class DeleteProductController {
	@FXML
	TextField deleteName;
	
	@FXML
	Label deleteerrorMsg;
	
	public void deleteButtonClicked() throws SQLException {
		String deleteNames=deleteName.getText();
		String deleteQuery="delete from product where product_name='"+deleteNames+"'";
		DBUtil.executeQuery(deleteQuery);
		deleteerrorMsg.setText("Product Deleted Successfully!!");
	}
	
	public void backButton() {
		new ProductManagement().show();
	}

}
