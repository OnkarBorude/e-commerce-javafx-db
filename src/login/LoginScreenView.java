package login;

import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
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
	public void start(Stage stageOfJavaFx) throws Exception {
		StageHolder.stage=stageOfJavaFx;
		URL fxmlUrl=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\login\\LoginScreenForEcommerce.fxml").toUri().toURL();
		Parent actorGroup=FXMLLoader.load(fxmlUrl);
		StageHolder.stage.setTitle("Login Screen");
		Scene scene=new Scene(actorGroup, 1400, 750);
		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();
		
	}
}
