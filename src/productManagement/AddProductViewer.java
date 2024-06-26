package productManagement;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProductViewer {
	public static void addProductClickedButton() {
		try {
	URL fxmls=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\productManagement\\addProductScreenView.fxml").toUri().toURL();
		try {
			Parent actorgroup=FXMLLoader.load(fxmls);
			StageHolder.stage.setTitle("Add Product");
			Scene scene=new Scene(actorgroup, 1300, 800);
			StageHolder.stage.setScene(scene);
			StageHolder.stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
