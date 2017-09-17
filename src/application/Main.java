package application;
	
import java.net.URL;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {

	  public void PressOkButton(ActionEvent event) {
	       System.out.println("Button Clicked!");
 	       Date now= new Date(0);
 	       DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
 
 	       // Model Data
	        String dateTimeString = df.format(now);
	        
	        System.out.println( "val is " +event.toString());
	        // Show in VIEW
	      //  myTextField.setText(dateTimeString);
	      
	   }
	  
	  
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("MainEntrylayout.fxml"));
		    primaryStage.setTitle("GST Calculation app");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

            
/*			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
*/		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

 
}

