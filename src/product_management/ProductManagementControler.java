package product_management;

import home.HomeScreenView;


public class ProductManagementControler {
	public void addproductClickes() {
		ProductManagementViewer.addProductClickedButton();
	}
	
	public void updateProductClick() {
		ProductManagementViewer.updateProductClickedButton();
	}
	
	public void exitProductManagement() {
		HomeScreenView.show();
	}

}
