package home;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeScreenView extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage statge) throws Exception {
		URL fxmlUrl=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\home\\homeScreen.fxml").toUri().toURL();
		Parent actorGroup=FXMLLoader.load(fxmlUrl);
		statge.setTitle("Home Screen");
		Scene scene=new Scene(actorGroup, 1300, 800);
		statge.setScene(scene);
		statge.show();
	}
	
	

}
