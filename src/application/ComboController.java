package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class ComboController implements Initializable{
	@FXML
	private ComboBox combo_box;
	ObservableList<String> obList = FXCollections.observableArrayList("1-B2B","1-B2C Small","1-DNCN", "2-Purchase");

	   public void DropDownAction(ActionEvent event) {
		   System.out.println("on button clicked drop down list");
	   }
	   
	   
	   public void PressOkButton(ActionEvent event) throws IOException {
		   
		 //  System.out.println("PressOkButton on button clicked drop down list" + combo_box.getItems());
		   System.out.println("PressOkButton  value " + combo_box.getValue());
		   if(combo_box.getValue().equals("1-B2B"))
		   {
			   System.out.println("1-B2B");
			   FXMLLoader fxmlLoader = new FXMLLoader();
		        fxmlLoader.setLocation(getClass().getResource("One2B_child.fxml"));
		        /* 
		         * if "fx:controller" is not set in fxml
		         * fxmlLoader.setController(NewWindowController);
		         */
		        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
		        Stage stage = new Stage();
		        stage.setTitle("New Window");
		        stage.setScene(scene);
		        stage.show();
			   
		   }
		   else if(combo_box.getValue().equals("1-B2C Small"))
		   {
			   System.out.println("1-B2C Small");			   
			   FXMLLoader fxmlLoader = new FXMLLoader();
		        fxmlLoader.setLocation(getClass().getResource("OneBTwoC_child.fxml"));
		        /* 
		         * if "fx:controller" is not set in fxml
		         * fxmlLoader.setController(NewWindowController);
		         */
		        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
		        Stage stage = new Stage();
		        stage.setTitle("New Window");
		        stage.setScene(scene);
		        stage.show();
		   }
		   else if(combo_box.getValue().equals("1-DNCN"))
		   {
			   System.out.println("1-DNCN");
			   FXMLLoader fxmlLoader = new FXMLLoader();
		        fxmlLoader.setLocation(getClass().getResource("OneDNCN_child.fxml"));
		        /* 
		         * if "fx:controller" is not set in fxml
		         * fxmlLoader.setController(NewWindowController);
		         */
		        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
		        Stage stage = new Stage();
		        stage.setTitle("New Window");
		        stage.setScene(scene);
		        stage.show();
		   }
		   else if(combo_box.getValue().equals("2-Purchase"))
		   {
			   System.out.println("2-Purchase");			   
			   FXMLLoader fxmlLoader = new FXMLLoader();
		        fxmlLoader.setLocation(getClass().getResource("TwoPurchase_child.fxml"));
		        /* 
		         * if "fx:controller" is not set in fxml
		         * fxmlLoader.setController(NewWindowController);
		         */
		        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
		        Stage stage = new Stage();
		        stage.setTitle("New Window");
		        stage.setScene(scene);
		        stage.show();
		   }
	   }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println("ggggggggggggggg");
		combo_box.setItems(obList);
		
		
	}

}
