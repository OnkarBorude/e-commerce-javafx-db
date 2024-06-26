package home;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class HomeScreenView{
	
	public static void show() {
		
		try {
			URL fxmlUrl = Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\home\\HomeScreenEcommerce.fxml").toUri().toURL();
			Parent actorGroup = FXMLLoader.load(fxmlUrl);
			StageHolder.stage.setTitle("Home Screen");
			Scene scene=new Scene(actorGroup, 1300, 800);
			StageHolder.stage.setScene(scene);
			StageHolder.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	

}
