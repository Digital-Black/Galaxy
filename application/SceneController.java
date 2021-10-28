package application;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController {
		
	
		// JavaFX scene structure
		private Stage stage;
		private Scene scene;
		private Parent root;
		
		// Student class data
		String deadline;
		String assn1;
		String assn2;
		String assn3;
		
		// Button and field interactions
		@FXML
		public Label deadlineLabel;
		@FXML
		private TextField deadlineTextField;
		@FXML
		private Button deadlineSave;
		@FXML
		private Label assn1Label;
		@FXML
		private TextField assn1TextField;
		@FXML
		private Button assn1Save;
		@FXML
		private Label assn2Label;
		@FXML
		private TextField assn2TextField;
		@FXML
		private Button assn2Save;
		@FXML
		private Label assn3Label;
		@FXML
		private TextField assn3TextField;
		@FXML
		private Button assn3Save;

		
		// Data serialization
		public void saveDeadline(ActionEvent event) {
			
			deadline = deadlineTextField.getText();
			deadlineLabel.setText("Deadline: " + deadline);
			
			// Manual data handling
			try {
				FileWriter writer = new FileWriter("C:\\Users\\USER\\Desktop\\deadline.txt");
				writer.write(deadline);
				writer.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Data deserialization
		public void loadDeadline(ActionEvent event) {
			
			// Manual data handling retaining Scanner as resource
			try {	
				File text = new File("C:\\Users\\USER\\Desktop\\deadline.txt");
		        Scanner scnr = new Scanner(text);
		        	while(scnr.hasNextLine()){
		        		String line = scnr.nextLine();
		        		deadlineTextField.setText(line);
		    			deadlineLabel.setText("Deadline: " + line);
		    			System.out.println(line);
		        }
					Scanner in = new Scanner(new FileReader("C:\\Users\\USER\\Desktop\\deadline.txt"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
		
		// Assignment interactivity
		public void saveAssn1(ActionEvent event) {
			
			assn1 = assn1TextField.getText();
			assn1Label.setText("Assignment 1: " + assn1);
		}
		
		public void saveAssn2(ActionEvent event) {
			
			assn2 = assn2TextField.getText();
			assn2Label.setText("Assignment 2: " + assn2);
		}
		
		public void saveAssn3(ActionEvent event) {
			
			assn3 = assn3TextField.getText();
			assn3Label.setText("Assignment 3: " + assn3);
		}
		
		// Menu system functionality
		public void switchToClassDashboard(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("ClassDashboard.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
			
		public void switchToClass1(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("Class1.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		}
		
		public void switchToClass2(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("Class2.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
		public void switchToClass3(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("Class3.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
		public void switchToClass4(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("Class4.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
		public void createNewClass(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("ClassDashboard.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			
		}
		
		
		public void UserButton(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("UserButton.java"));
		}
		
		public void switchToMain(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();	
		}
		
		public void switchToWorkDashboard(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("WorkDashboard.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}


}
