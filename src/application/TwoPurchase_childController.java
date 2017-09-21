package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

import model.Table_2Purchase;

public class TwoPurchase_childController implements Initializable {
	@FXML TableView<Table_2Purchase> tableID;
	@FXML TableColumn<Table_2Purchase,Integer > Sno_Id;	
	@FXML TableColumn<Table_2Purchase,String > igstin;	
	@FXML TableColumn<Table_2Purchase,String> iInvoice_No;
	@FXML TableColumn<Table_2Purchase,String> iInvoice_Date;
	@FXML TableColumn<Table_2Purchase,String> iInvoice_value;
	@FXML TableColumn<Table_2Purchase,String> iInvoice_Goods;
	@FXML TableColumn<Table_2Purchase,String> iInvoice_HSN;
	@FXML TableColumn<Table_2Purchase,String> iTaxableValue;
	@FXML TableColumn<Table_2Purchase,String> iIgst_Rate;
	@FXML TableColumn<Table_2Purchase,String> iIgst_Amount;
	@FXML TableColumn<Table_2Purchase,String> iCgst_Rate;
	@FXML TableColumn<Table_2Purchase,String> iCgst_Amount;
	@FXML TableColumn<Table_2Purchase,String> iSgst_Rate;
	@FXML TableColumn<Table_2Purchase,String> iSgst_Amount;
	@FXML TableColumn<Table_2Purchase,String> iPoc;
	@FXML TableColumn<Table_2Purchase,String> iItc;
	@FXML TableColumn<Table_2Purchase,String> iIgst_Amount_1;
	@FXML TableColumn<Table_2Purchase,String> iCgst_Amount_1;
	@FXML TableColumn<Table_2Purchase,String> iSgst_Amount_1;
	@FXML TableColumn<Table_2Purchase,String> iIgst_Amount_2;
	@FXML TableColumn<Table_2Purchase,String> iCgst_Amount_2;
	@FXML TableColumn<Table_2Purchase,String> iSgst_Amount_2;
	@FXML TableColumn<Table_2Purchase,String> iReverse;
	@FXML TableColumn<Table_2Purchase,String > iPopulated;
	
		
	public TextField gigstin;		
	public TextField gInvoice_No;
	public TextField gInvoice_Date;
	public TextField gInvoice_value;
	public TextField gInvoice_Goods;
	public TextField gInvoice_HSN;
	public TextField gTaxableValue;
	public TextField gIgst_Rate;
	public TextField gIgst_Amount;
	public TextField gCgst_Rate;
	public TextField gCgst_Amount;
	public TextField gSgst_Rate;
	public TextField gSgst_Amount;
	public TextField gPoc;
	public TextField gItc;
	public TextField gIgst_Amount_1;
	public TextField gCgst_Amount_1;
	public TextField gSgst_Amount_1;
	public TextField gIgst_Amount_2;
	public TextField gCgst_Amount_2;
	public TextField gSgst_Amount_2;
	public TextField gReverse;
	public TextField gPopulated;	
	@FXML Button Submit;
	
	private int iNumber = 1;
	public void onAddItem(ActionEvent event ){
		Table_2Purchase entry  = new Table_2Purchase(iNumber,
				gigstin.getText(),	
				gInvoice_No.getText(),
				gInvoice_Date.getText(),
				gInvoice_value.getText(),
				gInvoice_Goods.getText(),
				gInvoice_HSN.getText(),
				gTaxableValue.getText(),
				gIgst_Rate.getText(),
				gIgst_Amount.getText(),
				gCgst_Rate.getText(),
				gCgst_Amount.getText(),
				gSgst_Rate.getText(),
				gSgst_Amount.getText(),
				gPoc.getText(),
				gItc.getText(),
				gIgst_Amount_1.getText(),
				gCgst_Amount_1.getText(),
				gSgst_Amount_1.getText(),
				gIgst_Amount_2.getText(),
				gCgst_Amount_2.getText(),
				gSgst_Amount_2.getText(),
				gReverse.getText(),
				gPopulated.getText());//

	iNumber++;
	data.add(entry);
	clearForm();
	}
	
	private void clearForm() {
		// TODO Auto-generated method stub
		//nameInput.clear();
	}
	
	final ObservableList<Table_2Purchase> data = FXCollections.observableArrayList();
			//new Table(iNumber ++, "rGstinuin","Name_1"));//, "09/01/2017")
			
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		Sno_Id.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,Integer>("rID"));
		igstin.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rGstinuin"));
		iInvoice_No.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rInvoiceno"));
		iInvoice_Date.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rInvoicedate"));
		iInvoice_value.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rInvoicevalue"));
		iInvoice_Goods.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rInvoicegoods"));
		iInvoice_HSN.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rInvoicehsn"));
		iTaxableValue.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rTaxablevalue"));
		iIgst_Rate.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rIgstrate"));
		iIgst_Amount.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rIgstamount"));
		
		iCgst_Rate.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rCgstrate"));
		iCgst_Amount.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rCgstamount"));
		iSgst_Rate.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rSgstrate"));
		
		iSgst_Amount.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rSgstamount"));
		
		iPoc.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rPoc"));
		iItc.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rItc"));
		
		/*iIgst_Amount_1.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rIgstamount1"));
		iCgst_Amount_1.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rCgstamount1"));
		iSgst_Amount_1.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rSgstamount1"));
		iIgst_Amount_2.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rIgstamount2"));
		iCgst_Amount_2.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rCgstamount2"));
		iSgst_Amount_2.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rSgstamount2"));
		*/
		iReverse.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rReverse"));
		iPopulated.setCellValueFactory(new PropertyValueFactory<Table_2Purchase,String>("rPopulate"));
		
		tableID.setItems(data);
		tableID.setEditable(true);
		
		igstin.setCellFactory(TextFieldTableCell.forTableColumn());
		iInvoice_No.setCellFactory(TextFieldTableCell.forTableColumn());
		iInvoice_Date.setCellFactory(TextFieldTableCell.forTableColumn());
		iInvoice_value.setCellFactory(TextFieldTableCell.forTableColumn());
		iInvoice_Goods.setCellFactory(TextFieldTableCell.forTableColumn());
		iInvoice_HSN.setCellFactory(TextFieldTableCell.forTableColumn());
		iTaxableValue.setCellFactory(TextFieldTableCell.forTableColumn());
		
		
		iIgst_Rate.setCellFactory(TextFieldTableCell.forTableColumn());
		iIgst_Amount.setCellFactory(TextFieldTableCell.forTableColumn());
		iCgst_Rate.setCellFactory(TextFieldTableCell.forTableColumn());
		iCgst_Amount.setCellFactory(TextFieldTableCell.forTableColumn());
		iSgst_Rate.setCellFactory(TextFieldTableCell.forTableColumn());
		
		iSgst_Amount.setCellFactory(TextFieldTableCell.forTableColumn());
		
		iPoc.setCellFactory(TextFieldTableCell.forTableColumn());
		iItc.setCellFactory(TextFieldTableCell.forTableColumn());
		/*iIgst_Amount_1.setCellFactory(TextFieldTableCell.forTableColumn());
		iCgst_Amount_1.setCellFactory(TextFieldTableCell.forTableColumn());
		iSgst_Amount_1.setCellFactory(TextFieldTableCell.forTableColumn());
		iIgst_Amount_2.setCellFactory(TextFieldTableCell.forTableColumn());
		iCgst_Amount_2.setCellFactory(TextFieldTableCell.forTableColumn());
		iSgst_Amount_2.setCellFactory(TextFieldTableCell.forTableColumn());
		*/
		iReverse.setCellFactory(TextFieldTableCell.forTableColumn());
		iPopulated.setCellFactory(TextFieldTableCell.forTableColumn());
		
		    
	}

	public void updateGstinuin(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem();	
		personSelected.setRGstinuin(editCell.getNewValue().toString());				
	}
	
	public void updateInvoicedate(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRInvoicedate(editCell.getNewValue().toString());	
	}
	public void updateInvoicevalue(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRInvoicevalue(editCell.getNewValue().toString());	
	}
	public void updateInvoicegoods(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRInvoicegoods(editCell.getNewValue().toString());	
	}
	public void updateInvoicehsn(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRInvoicehsn(editCell.getNewValue().toString());	
	}
	public void updateTaxablevalue(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRTaxablevalue(editCell.getNewValue().toString());	
	}

	public void updateIgstrate(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRIgstrate(editCell.getNewValue().toString());	
	}
	public void updateIgstamount(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRIgstamount(editCell.getNewValue().toString());	
	}
	public void updateCgstrate(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRIgstrate(editCell.getNewValue().toString());	
	}
	public void updateCgstamount(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRCgstamount(editCell.getNewValue().toString());	
	}
	public void updateSgstrate(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRSgstrate(editCell.getNewValue().toString());	
	}
	public void updateSgstamount(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRSgstamount(editCell.getNewValue().toString());	
	}
	
	//st
	public void updatePoc(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRPoc(editCell.getNewValue().toString());	
	}
	
	public void updateItc(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRItc(editCell.getNewValue().toString());	
	}
	
	public void updateIgstamount1(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRIgstamount1(editCell.getNewValue().toString());	
	}
	
	public void updateCgstamount1(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRCgstamount1(editCell.getNewValue().toString());	
	}
	
	public void updateSgstamount1(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRSgstamount1(editCell.getNewValue().toString());	
	}
	
	public void updateIgstamount2(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRIgstamount2(editCell.getNewValue().toString());	
	}
	
	public void updateSgstamount2(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRSgstamount2(editCell.getNewValue().toString());	
	}
	
	public void updatePopulate(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRPopulate(editCell.getNewValue().toString());	
	}
	
	public void updateCgstamount2(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRCgstamount2(editCell.getNewValue().toString());	
	}
	

	//end
	
	public void updateReverse(CellEditEvent editCell)
	{
		Table_2Purchase  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRReverse(editCell.getNewValue().toString());	
	}
	

}
