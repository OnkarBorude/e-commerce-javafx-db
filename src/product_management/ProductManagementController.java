package product_management;

import add_product.AddProduct;
import delete_product.DeleteProduct;
import home.HomeScreen;
import search_product.SearchProduct;
import update_product.UpdateProduct;

public class ProductManagementController {
	public void addproductClickes() {
		new AddProduct().show();
	}
	
	public void updateProductClick() {
		new UpdateProduct().show();

	}
	
	public void searchProductClick() {
		new SearchProduct().show();

	}
	
	public void deleteProductClick() {
		new DeleteProduct().show();

	}
	
	public void exitProductManagement() {
		new HomeScreen().show();

	}

}
