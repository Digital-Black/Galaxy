package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	
	// Scene back-end
	Scene scene1, scene2, scene3, scene4, scene5, scene6;
	
	public static void main(String[] args) {
		launch(args);
	
	}
	
	// Main menu initialization
	@Override
	public void start(Stage stage) throws Exception {
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
			Scene scene1 = new Scene(root);
			Image icon = new Image("/graphic.jpg");
			stage.getIcons().add(icon);
			stage.setTitle("Galaxy");
			stage.setScene(scene1);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}



