/**
 * 
 */
/**
 * @author Arkey
 *
 */
package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Table
{

	private final SimpleIntegerProperty rID;
	private final SimpleStringProperty rGstinuin;
	private final SimpleStringProperty rTypenote;
	private final SimpleStringProperty rCreditdebitno;
	private final SimpleStringProperty rCreditdebitdate;
	private final SimpleStringProperty rOriginalinvoiceno;
	private final SimpleStringProperty rOriginalinvoicedate;
	private final SimpleStringProperty rOriginalinvoicehsn;
	private final SimpleStringProperty rOriginalinvoicegoods;
	private final SimpleStringProperty rDifferentialvalue;
	private final SimpleStringProperty rIgstrate;
	private final SimpleStringProperty rIgstamount;
	private final SimpleStringProperty rCgstrate;
	private final SimpleStringProperty rCgstamount;
	private final SimpleStringProperty rSgstrate;
	private final SimpleStringProperty rSgstamount;
	private final SimpleStringProperty rReverse;
	
	public Table(int rID, String rGstinuin,/*String rName,*/
		String TypeNoteInput,
		String CreditDebitNoInput,
		String CreditDebitDateInput,
		String OriginalInvoice_NoInput,
		String OriginalInvoice_DateInput,
		String OriginalInvoice_HSNInput,
		String OriginalInvoice_GoodsInput,
		String Differential_ValueInput,
		String IGST_RateInput,
		String IGST_AmountInput,
		String CGST_RateInput,
		String CGST_AmountInput,
		String SGST_RateInput,
		String SGST_AmountInput,
		String ReverseInput
		){
		this.rID = new SimpleIntegerProperty(rID);
		this.rGstinuin = new SimpleStringProperty(rGstinuin);
		this.rTypenote=  new SimpleStringProperty(TypeNoteInput);
		this.rCreditdebitno=  new SimpleStringProperty(CreditDebitNoInput);
		this.rCreditdebitdate=  new SimpleStringProperty(CreditDebitDateInput);
		this.rOriginalinvoiceno=  new SimpleStringProperty(OriginalInvoice_NoInput);
		this.rOriginalinvoicedate=  new SimpleStringProperty(OriginalInvoice_DateInput);
		this.rOriginalinvoicehsn=  new SimpleStringProperty(OriginalInvoice_HSNInput);
		this.rOriginalinvoicegoods=  new SimpleStringProperty(OriginalInvoice_GoodsInput);
		this.rDifferentialvalue=  new SimpleStringProperty(Differential_ValueInput);
		this.rIgstrate=  new SimpleStringProperty(IGST_RateInput);
		this.rIgstamount=  new SimpleStringProperty(IGST_AmountInput);
		this.rCgstrate=  new SimpleStringProperty(CGST_RateInput);
		this.rCgstamount=  new SimpleStringProperty(CGST_AmountInput);
		this.rSgstrate=  new SimpleStringProperty(SGST_RateInput);
		this.rSgstamount=  new SimpleStringProperty(SGST_AmountInput);
		this.rReverse=  new SimpleStringProperty(ReverseInput);
		
	}
	
	public Integer getRID(){
		return rID.get();
	}
	public void setRID(Integer val)
	{
		rID.set(val);		
	}
	
	public String getRGstinuin(){
		return rGstinuin.get();
	}
	public void setRGstinuin(String val)
	{
		rGstinuin.set(val);		
	}
	
	public String getRTypenote(){
		return rTypenote.get();
	}
	public void setRTypenote(String val)
	{
		rTypenote.set(val);		
	}
	
	public String getRCreditdebitno(){
		return rCreditdebitno.get();
	}
	public void setRCreditdebitno(String val)
	{
		rCreditdebitno.set(val);		
	}
	
	public String getRCreditdebitdate(){
		return rCreditdebitdate.get();
	}
	public void setRCreditdebitdate(String val)
	{
		rCreditdebitdate.set(val);		
	}
	
	public String getROriginalinvoiceno(){
		return rOriginalinvoiceno.get();
	}
	public void setROriginalinvoiceno(String val)
	{
		rOriginalinvoiceno.set(val);		
	}
	
	public String getROriginalinvoicedate(){
		return rOriginalinvoicedate.get();
	}
	public void setROriginalinvoicedate(String val)
	{
		rOriginalinvoicedate.set(val);		
	}
	
	public String getROriginalinvoicehsn(){
		return rOriginalinvoicehsn.get();
	}
	public void setROriginalinvoicehsn(String val)
	{
		rOriginalinvoicehsn.set(val);		
	}
	
	public String getROriginalinvoicegoods(){
		return rOriginalinvoicegoods.get();
	}
	public void setROriginalinvoicegoods(String val)
	{
		rOriginalinvoicegoods.set(val);		
	}
	
	public String getRDifferentialvalue(){
		return rDifferentialvalue.get();
	}
	public void setRDifferentialvalue(String val)
	{
		rDifferentialvalue.set(val);		
	}
	public String getRIgstrate(){
		return rIgstrate.get();
	}
	public void setRIgstrate(String val)
	{
		rIgstrate.set(val);		
	}
	public String getRIgstamount(){
		return rIgstamount.get();
	}
	public void setRIgstamount(String val)
	{
		rIgstamount.set(val);		
	}
	public String getRCgstrate(){
		return rCgstrate.get();
	}
	public void setRCgstrate(String val)
	{
		rCgstrate.set(val);		
	}
	public String getRCgstamount(){
		return rCgstamount.get();
	}
	public void setRCgstamount(String val)
	{
		rCgstamount.set(val);		
	}
	public String getRSgstrate(){
		return rSgstrate.get();
	}
	public void setRSgstrate(String val)
	{
		rSgstrate.set(val);		
	}
	public String getRSgstamount(){
		return rSgstamount.get();
	}
	public void setRSgstamount(String val)
	{
		rSgstamount.set(val);		
	}
	public String getRReverse(){
		return rReverse.get();
	}
	public void setRReverse(String val)
	{
		rReverse.set(val);		
	}

}
