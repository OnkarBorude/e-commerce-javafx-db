package login;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreenView extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		URL fxmlUrl=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\login\\LoginScreens.fxml").toUri().toURL();
		Parent actorGroup=FXMLLoader.load(fxmlUrl);
		stage.setTitle("Login Screen");
		Scene scene=new Scene(actorGroup, 1150, 675);
		stage.setScene(scene);
		stage.show();
		
	}
}
