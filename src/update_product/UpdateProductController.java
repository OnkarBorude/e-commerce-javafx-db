package update_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_management.ProductManagement;


public class UpdateProductController {
	@FXML
	TextField updateName;
	
	@FXML
	TextField pname;
	
	@FXML
	TextField pquantity;
	
	@FXML
	TextField pprice;
	
	@FXML
	Label errormsg;
	
	@FXML
	Label errormsgAtEnd;
	
	public void submitProductClicked() throws SQLException {
		String updaten=updateName.getText();
		
		
		String selectQuery="select * from product where product_name='"+updaten+"'";
		ResultSet resultset=DBUtil.selectQuery(selectQuery);
		if(resultset.next()) {
			errormsg.setText("Enter updated Product Detail:");
		}else {
			errormsg.setText("Product Not Found");
		}
		
	}
	
	public void updateUserClick() throws SQLException {
		String updaten=updateName.getText();
		String pnames=pname.getText();
		String pquantities=pquantity.getText();
		String pprices=pprice.getText();
		String updateroduct="update product set product_name='"+pnames+"',product_quantity='"+pquantities+"',product_price='"+pprices+"' where product_name='"+updaten+"'";
		DBUtil.executeQuery(updateroduct);
		errormsgAtEnd.setText("Product Update Succeesfully!!");
	}
	
	public void backButtonClick() {
		new ProductManagement().show();
	}

}
