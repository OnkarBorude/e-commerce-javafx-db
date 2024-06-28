package main;

import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.LoginScreenViewer;

public class LoginScreenView extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stageOfJavaFx) throws Exception {
		StageHolder.stage=stageOfJavaFx;
		LoginScreenViewer.show();
		
	}
}
