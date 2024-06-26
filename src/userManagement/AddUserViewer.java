package userManagement;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddUserViewer {
	public static void addUserClickButton() {
	try {
		
	URL fxmlurs=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\userManagement\\AddUserScreens.fxml").toUri().toURL();
	try {
		Parent actorgroup=FXMLLoader.load(fxmlurs);
		StageHolder.stage.setTitle("Add User");
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
