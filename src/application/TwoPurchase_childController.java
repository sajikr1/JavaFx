package application;

//import java.awt.Button;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
/*import java.net.URL;
import java.util.ResourceBundle;
*/
import model.Table;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;

public class TwoPurchase_childController implements Initializable {

	@FXML TableView<Table> tableID;
	
	@FXML TableColumn<Table,Integer > iID;	
	@FXML 
	//	TableColumn<Table,Integer > iName;
	 TableColumn<Table,String> iName;

	@FXML TableColumn<Table,Integer > iDate;
	@FXML TableColumn<Table,Integer > iGSTIN;
	
	@FXML TableColumn<Table,Integer > iPrice;
	
	public TextField nameInput;
	
	
	@FXML
	Button Submit;
	
	private int iNumber = 1;
	public void onAddItem(ActionEvent event ){
	Table entry  = new Table(iNumber, nameInput.getText());
	iNumber++;
	
	data.add(entry);
	clearForm();
	}
	
	private void clearForm() {
		// TODO Auto-generated method stub
		nameInput.clear();
		System.out.println("clearForm called bbbbbbbbb : "+ nameInput.getText());
	}

	
	
	final ObservableList<Table> data = FXCollections.observableArrayList(
			new Table(iNumber ++, "Name_1"));//, "09/01/2017")
			
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		iID.setCellValueFactory(new PropertyValueFactory<Table,Integer>("rID"));
		
		//iID.se(iID);
		//iName.setCellValueFactory(new PropertyValueFactory<Table,Integer>("rName"));
		
		iName.setCellValueFactory(new PropertyValueFactory<Table,String>("rName"));
		tableID.setItems(data);
		tableID.setEditable(true);
		iName.setCellFactory(TextFieldTableCell.forTableColumn());
		//iID.setCellFactory(TextFieldTableCell.forTableColumn());
		System.out.println("initialize called zzzzzzzzzzz");
		    
	}

	public void changeFirstNameCellEvent(CellEditEvent editCell)
	{
		Table  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRName(editCell.getNewValue().toString());
				
	}
	/*public void changeIDCellEvent(CellEditEvent editCell)
	{
		Table  personSelected = tableID.getSelectionModel().getSelectedItem(); 
	//	personSelected.setRID((Integer) editCell.getNewValue());
		
				
	}*/
	

}
