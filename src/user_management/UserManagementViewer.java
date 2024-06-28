package user_management;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UserManagementViewer {
	public static void userManageShow() {
		try {
			URL fxmlurls=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\user_management\\usersmanagement.fxml").toUri().toURL();
			try {
				Parent actorGroup=FXMLLoader.load(fxmlurls);
				Scene scene=new Scene(actorGroup, 1300, 800);
				StageHolder.stage.setTitle("User Management");
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
	
	public static void addUserClickButton() {
		try {
			
		URL fxmlurs=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\user_management\\AddUserScreens.fxml").toUri().toURL();
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
	
	public static void updateUserShow() {
		
		try {
			URL fxmlurls=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\user_management\\updateUserScreen.fxml").toUri().toURL();
			try {
				Parent actorGroup=FXMLLoader.load(fxmlurls);
				StageHolder.stage.setTitle("Update User");
				Scene scene=new Scene(actorGroup, 1300, 800);
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
	
	public static void searchUserShow() {
		
		try {
			URL fxmlurls=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\user_management\\SearchUserScreen.fxml").toUri().toURL();
			try {
				Parent actorGroup=FXMLLoader.load(fxmlurls);
				StageHolder.stage.setTitle("Search User");
				Scene scene=new Scene(actorGroup, 1300, 800);
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
	
public static void deleteUserShow() {
		
		try {
			URL fxmlurls=Paths.get("C:\\Users\\onkar\\eclipse-workspace\\e-commerce-javafx-db\\src\\user_management\\deleteUser.fxml").toUri().toURL();
			try {
				Parent actorGroup=FXMLLoader.load(fxmlurls);
				StageHolder.stage.setTitle("Delete User");
				Scene scene=new Scene(actorGroup, 1300, 800);
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
