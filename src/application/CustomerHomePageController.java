package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CustomerHomePageController {
	@FXML
	TextField username;
	@FXML
	TextField email;
	@FXML
	TextField firstname;
	@FXML
	TextField lastname;
	@FXML
	TextField addressname;
	@FXML
	TextField phone;
	@FXML
	PasswordField password;
	@FXML
	Button signout;
	
	@FXML
	public void personalInfo(ActionEvent event) throws IOException {
		Stage primaryStage = new Stage();
		Parent root;
		root = FXMLLoader.load(getClass().getResource("/application/PersonalInfo.fxml"));
		Scene scene1 = new Scene(root, 327, 394);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene1);
		primaryStage.show();
		
		// get user info from db and put then in the text fields
		
	
	}
	@FXML
	public void savePersonalInfo(ActionEvent event) throws IOException {
		// update user db from text fields
		Stage stage = (Stage) username.getScene().getWindow();
	    stage.close();
	}
	@FXML
	public void searchForBooks(ActionEvent event) throws IOException {
		
		Stage primaryStage = new Stage();
		Parent root;
		root = FXMLLoader.load(getClass().getResource("/application/SearchForBooks.fxml"));
		Scene scene1 = new Scene(root,909, 888);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	@FXML
	public void shoppingCart(ActionEvent event) throws IOException {
		Stage primaryStage = new Stage();
		Parent root;
		root = FXMLLoader.load(getClass().getResource("/application/ShoppingCart.fxml"));
		Scene scene1 = new Scene(root,451, 437);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	@FXML
	public void logout(ActionEvent event) throws IOException {
		
		// delete all shopping cart
		
		Stage primaryStage = new Stage();
		Parent root;
		root = FXMLLoader.load(getClass().getResource("/application/First.fxml"));
		Scene scene1 = new Scene(root, 396, 405);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage = (Stage) signout.getScene().getWindow();
	    stage.close();
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
}
