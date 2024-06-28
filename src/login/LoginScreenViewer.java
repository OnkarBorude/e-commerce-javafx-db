package login;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginScreenViewer {
	
	public static void show() {
		
		
		try {
			URL fxmlUrl = Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\login\\LoginScreenForEcommerce.fxml").toUri().toURL();
			
			try {
				Parent actorGroup = FXMLLoader.load(fxmlUrl);
				StageHolder.stage.setTitle("Login Screen");
				Scene scene=new Scene(actorGroup, 1400, 750);
				StageHolder.stage.setScene(scene);
				StageHolder.stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
