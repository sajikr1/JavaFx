package application;



import model.Table_OneB2C;

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

public class OneB2C_small_childController implements Initializable {

	@FXML TableView<Table_OneB2C> tableID;
	@FXML TableColumn<Table_OneB2C,Integer > Sno_Id;	
	@FXML TableColumn<Table_OneB2C,String> iGoods;
	@FXML TableColumn<Table_OneB2C,String> iHsn;
	@FXML TableColumn<Table_OneB2C,String> iStatecode;
	@FXML TableColumn<Table_OneB2C,String> iTaxableval;
	
	@FXML TableColumn<Table_OneB2C,String> iIgst_Rate;
	@FXML TableColumn<Table_OneB2C,String> iIgst_Amount;
	@FXML TableColumn<Table_OneB2C,String> iCgst_Rate;
	@FXML TableColumn<Table_OneB2C,String> iCgst_Amount;
	@FXML TableColumn<Table_OneB2C,String> iSgst_Rate;
	@FXML TableColumn<Table_OneB2C,String> iSgst_Amount;
	@FXML TableColumn<Table_OneB2C,String> iTaxoninvoice;
	
	
	public TextField GoodsInput;
	public TextField HsnInput;
	public TextField StatecodeInput;
	public TextField TaxablevalInput;
	public TextField IgstrateInput;
	public TextField IgstamountInput;
	public TextField CgstrateInput;
	public TextField CgstamountInput;
	public TextField SgstrateInput;
	public TextField SgstamountInput;
	public TextField TaxoninvoiceInput;
	
	@FXML Button Submit;
	
	private int iNumber = 1;
	public void onAddItem(ActionEvent event ){
		Table_OneB2C entry  = new Table_OneB2C(iNumber, 
				GoodsInput.getText(),
				HsnInput.getText(),
				StatecodeInput.getText(),
				TaxablevalInput.getText(),
				IgstrateInput.getText(),
				IgstamountInput.getText(),
				CgstrateInput.getText(),
				CgstamountInput.getText(),
				SgstrateInput.getText(),
				SgstamountInput.getText(),
				TaxoninvoiceInput.getText());

	iNumber++;
	data.add(entry);
	clearForm();
	}
	
	private void clearForm() {
		// TODO Auto-generated method stub
		//nameInput.clear();
	}
	
	final ObservableList<Table_OneB2C> data = FXCollections.observableArrayList();
			//new Table(iNumber ++, "rGstinuin","Name_1"));//, "09/01/2017")
			
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		Sno_Id.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,Integer>("rID"));
		iGoods.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rGoods"));
		iHsn.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rHsn"));
		iStatecode.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rStatecode"));
		iTaxableval.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rTaxableval"));		
		iIgst_Rate.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rIgstrate"));
		iIgst_Amount.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rIgstamount"));
		iCgst_Rate.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rCgstrate"));
		iCgst_Amount.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rCgstamount"));
		iSgst_Rate.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rSgstrate"));
		iSgst_Amount.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rSgstamount"));
		iTaxoninvoice.setCellValueFactory(new PropertyValueFactory<Table_OneB2C,String>("rTaxoninvoice"));
		
		tableID.setItems(data);
		tableID.setEditable(true);
		
		iGoods.setCellFactory(TextFieldTableCell.forTableColumn());
		iHsn.setCellFactory(TextFieldTableCell.forTableColumn());
		iStatecode.setCellFactory(TextFieldTableCell.forTableColumn());
		iTaxableval.setCellFactory(TextFieldTableCell.forTableColumn());
		iIgst_Rate.setCellFactory(TextFieldTableCell.forTableColumn());
		iIgst_Amount.setCellFactory(TextFieldTableCell.forTableColumn());
		iCgst_Rate.setCellFactory(TextFieldTableCell.forTableColumn());
		iCgst_Amount.setCellFactory(TextFieldTableCell.forTableColumn());
		iSgst_Rate.setCellFactory(TextFieldTableCell.forTableColumn());
		iSgst_Amount.setCellFactory(TextFieldTableCell.forTableColumn());
		iTaxoninvoice.setCellFactory(TextFieldTableCell.forTableColumn());
		
		    
	}

	public void setRGoods(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem();	
		personSelected.setRGoods(editCell.getNewValue().toString());				
	}
	public void setRHsn(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRHsn(editCell.getNewValue().toString());	
	}
	public void setRStatecode(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRStatecode(editCell.getNewValue().toString());	
	}
	public void setRTaxableval(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRTaxableval(editCell.getNewValue().toString());	
	}
	
	public void updateIgstrate(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRIgstrate(editCell.getNewValue().toString());	
	}
	public void updateIgstamount(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRIgstamount(editCell.getNewValue().toString());	
	}
	public void updateCgstrate(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRIgstrate(editCell.getNewValue().toString());	
	}
	public void updateCgstamount(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRCgstamount(editCell.getNewValue().toString());	
	}
	public void updateSgstrate(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRSgstrate(editCell.getNewValue().toString());	
	}
	public void updateSgstamount(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRSgstamount(editCell.getNewValue().toString());	
	}
	public void setRTaxoninvoice(CellEditEvent editCell)
	{
		Table_OneB2C  personSelected = tableID.getSelectionModel().getSelectedItem(); 
		personSelected.setRTaxoninvoice(editCell.getNewValue().toString());	
	}
	

}
