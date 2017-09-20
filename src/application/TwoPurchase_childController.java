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
	@FXML TableColumn<Table,Integer > Sno_Id;//iID;	
	@FXML TableColumn<Table,String> iTypeNote;
	@FXML TableColumn<Table,String> iCreditDebitNo;
	@FXML TableColumn<Table,String> iCreditDebitDate;
	@FXML TableColumn<Table,String> iOriginalInvoice_No;
	@FXML TableColumn<Table,String> iOriginalInvoice_Date;
	@FXML TableColumn<Table,String> iOriginalInvoice_HSN;
	@FXML TableColumn<Table,String> iOriginalInvoice_Goods;
	@FXML TableColumn<Table,String> iDifferential_Value;
	@FXML TableColumn<Table,String> iIgst_Rate;
	@FXML TableColumn<Table,String> iIgst_Amount;
	@FXML TableColumn<Table,String> iCgst_Rate;
	@FXML TableColumn<Table,String> iCgst_Amount;
	@FXML TableColumn<Table,String> iSgst_Rate;
	@FXML TableColumn<Table,String> iSgst_Amount;
	@FXML TableColumn<Table,String> iReverse;
	@FXML TableColumn<Table,String > iGSTIN_UIN_Id;
	
	public TextField gstinuinInput;
	public TextField TypeNoteInput;
	public TextField CreditDebitNoInput;
	public TextField CreditDebitDateInput;
	public TextField OriginalInvoice_NoInput;
	public TextField OriginalInvoice_DateInput;
	public TextField OriginalInvoice_HSNInput;
	public TextField OriginalInvoice_GoodsInput;
	public TextField Differential_ValueInput;
	public TextField IGST_RateInput;
	public TextField IGST_AmountInput;
	public TextField CGST_RateInput;
	public TextField CGST_AmountInput;
	public TextField SGST_RateInput;
	public TextField SGST_AmountInput;
	public TextField ReverseInput;
	
	@FXML Button Submit;
	
	private int iNumber = 1;
	public void onAddItem(ActionEvent event ){
	Table entry  = new Table(iNumber,gstinuinInput.getText(), 
			TypeNoteInput.getText(),
			CreditDebitNoInput.getText(),
			CreditDebitDateInput.getText(),
			OriginalInvoice_NoInput.getText(),
			OriginalInvoice_DateInput.getText(),
			OriginalInvoice_HSNInput.getText(),
			OriginalInvoice_GoodsInput.getText(),
			Differential_ValueInput.getText(),
			IGST_RateInput.getText(),
			IGST_AmountInput.getText(),
			CGST_RateInput.getText(),
			CGST_AmountInput.getText(),
			SGST_RateInput.getText(),
			SGST_AmountInput.getText(),
			ReverseInput.getText());//

	iNumber++;
	data.add(entry);
	clearForm();
	}
	
	private void clearForm() {
		// TODO Auto-generated method stub
		//nameInput.clear();
	}
	
	final ObservableList<Table> data = FXCollections.observableArrayList();
			//new Table(iNumber ++, "rGstinuin","Name_1"));//, "09/01/2017")
			
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		//iID.setCellValueFactory(new PropertyValueFactory<Table,Integer>("rID"));
		Sno_Id.setCellValueFactory(new PropertyValueFactory<Table,Integer>("rID"));
		iGSTIN_UIN_Id.setCellValueFactory(new PropertyValueFactory<Table,String>("rGstinuin"));
		iTypeNote.setCellValueFactory(new PropertyValueFactory<Table,String>("rTypenote"));
		iCreditDebitNo.setCellValueFactory(new PropertyValueFactory<Table,String>("rCreditdebitno"));
		iCreditDebitDate.setCellValueFactory(new PropertyValueFactory<Table,String>("rCreditdebitdate"));
		iOriginalInvoice_No.setCellValueFactory(new PropertyValueFactory<Table,String>("rOriginalinvoiceno"));
		iOriginalInvoice_Date.setCellValueFactory(new PropertyValueFactory<Table,String>("rOriginalinvoicedate"));
		iOriginalInvoice_HSN.setCellValueFactory(new PropertyValueFactory<Table,String>("rOriginalinvoicehsn"));
		iOriginalInvoice_Goods.setCellValueFactory(new PropertyValueFactory<Table,String>("rOriginalinvoicegoods"));
		iDifferential_Value.setCellValueFactory(new PropertyValueFactory<Table,String>("rDifferentialvalue"));
		iIgst_Rate.setCellValueFactory(new PropertyValueFactory<Table,String>("rIgstrate"));
		iIgst_Amount.setCellValueFactory(new PropertyValueFactory<Table,String>("rIgstamount"));
		iCgst_Rate.setCellValueFactory(new PropertyValueFactory<Table,String>("rCgstrate"));
		iCgst_Amount.setCellValueFactory(new PropertyValueFactory<Table,String>("rCgstamount"));
		iSgst_Rate.setCellValueFactory(new PropertyValueFactory<Table,String>("rSgstrate"));
		iSgst_Amount.setCellValueFactory(new PropertyValueFactory<Table,String>("rSgstamount"));
		iReverse.setCellValueFactory(new PropertyValueFactory<Table,String>("rReverse"));
		
		tableID.setItems(data);
		tableID.setEditable(true);
		
		iGSTIN_UIN_Id.setCellFactory(TextFieldTableCell.forTableColumn());
		System.out.println("initialize called zzzzzzzzzzz");
		    
	}

	public void changeFirstNameCellEvent(CellEditEvent editCell)
	{
		Table  personSelected = tableID.getSelectionModel().getSelectedItem(); 
	//	personSelected.setRName(editCell.getNewValue().toString());
		personSelected.setRGstinuin(editCell.getNewValue().toString());
				
	}
	/*public void changeIDCellEvent(CellEditEvent editCell)
	{
		Table  personSelected = tableID.getSelectionModel().getSelectedItem(); 
	//	personSelected.setRID((Integer) editCell.getNewValue());
		
				
	}*/
	

}
