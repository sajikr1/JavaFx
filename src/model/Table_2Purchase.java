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

public class Table_2Purchase
{

	private final SimpleIntegerProperty rID;
	private final SimpleStringProperty rGstinuin;
	private final SimpleStringProperty rInvoiceno;
	private final SimpleStringProperty rInvoicedate;
	private final SimpleStringProperty rInvoicevalue;
	private final SimpleStringProperty rInvoicegoods;
	private final SimpleStringProperty rInvoicehsn;
	private final SimpleStringProperty rTaxablevalue;
	private final SimpleStringProperty rIgstrate;
	private final SimpleStringProperty rIgstamount;
	private final SimpleStringProperty rCgstrate;
	private final SimpleStringProperty rCgstamount;
	private final SimpleStringProperty rSgstrate;
	private final SimpleStringProperty rSgstamount;
	private final SimpleStringProperty rPoc;
	private final SimpleStringProperty rItc;
	private final SimpleStringProperty rIgstamount1;
	private final SimpleStringProperty rCgstamount1;
	private final SimpleStringProperty rSgstamount1;
	private final SimpleStringProperty rIgstamount2;
	private final SimpleStringProperty rCgstamount2;
	private final SimpleStringProperty rSgstamount2;
	private final SimpleStringProperty rReverse;
	private final SimpleStringProperty rPopulate;
	
	public Table_2Purchase(int rID,
			String rGstinuin,
			String rInvoiceno,
			String rInvoicedate,
			String rInvoicevalue,
			String rInvoicegoods,
			String rInvoicehsn,
			String rTaxablevalue,
			String rIgstrate,
			String rIgstamount,
			String rCgstrate,
			String rCgstamount,
			String rSgstrate,
			String rSgstamount,
			String rPoc,
			String rItc,
			String rIgstamount1,
			String rCgstamount1,
			String rSgstamount1,
			String rIgstamount2,
			String rCgstamount2,
			String rSgstamount2,
			String rReverse,
			String rPopulate
		){
		this.rID = new SimpleIntegerProperty(rID);
		this.rGstinuin = new SimpleStringProperty(rGstinuin);
		this.rInvoiceno=  new SimpleStringProperty(rInvoiceno);
		this.rInvoicedate=  new SimpleStringProperty(rInvoicedate);
		this.rInvoicevalue=  new SimpleStringProperty(rInvoicevalue);
		this.rInvoicegoods=  new SimpleStringProperty(rInvoicegoods);
		this.rInvoicehsn=  new SimpleStringProperty(rInvoicehsn);
		this.rTaxablevalue=  new SimpleStringProperty(rTaxablevalue);
		
		this.rIgstrate=  new SimpleStringProperty(rIgstrate);
		this.rIgstamount=  new SimpleStringProperty(rIgstamount);
		this.rCgstrate=  new SimpleStringProperty(rCgstrate);
		this.rCgstamount=  new SimpleStringProperty(rCgstamount);
		this.rSgstrate=  new SimpleStringProperty(rSgstrate);
		this.rSgstamount=  new SimpleStringProperty(rSgstamount);
		

		this.rPoc=  new SimpleStringProperty(rPoc);
		this.rItc=  new SimpleStringProperty(rItc);
		this.rIgstamount1=  new SimpleStringProperty(rIgstamount1);
		this.rCgstamount1=  new SimpleStringProperty(rCgstamount1);
		this.rSgstamount1=  new SimpleStringProperty(rSgstamount1);
		this.rIgstamount2=  new SimpleStringProperty(rIgstamount2);

		this.rCgstamount2=  new SimpleStringProperty(rCgstamount2);
		this.rSgstamount2=  new SimpleStringProperty(rSgstamount2);
		this.rPopulate=  new SimpleStringProperty(rPopulate);
		this.rReverse=  new SimpleStringProperty(rReverse);
		
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
	
	public String getRInvoiceno(){
		return rInvoiceno.get();
	}
	public void setRInvoiceno(String val)
	{
		rInvoiceno.set(val);		
	}
	
	public String getRInvoicedate(){
		return rInvoicedate.get();
	}
	public void setRInvoicedate(String val)
	{
		rInvoicedate.set(val);		
	}
	
	public String getRInvoicevalue(){
		return rInvoicevalue.get();
	}
	public void setRInvoicevalue(String val)
	{
		rInvoicevalue.set(val);		
	}
	
	public String getRInvoicegoods(){
		return rInvoicegoods.get();
	}
	public void setRInvoicegoods(String val)
	{
		rInvoicegoods.set(val);		
	}
	
	public String getRInvoicehsn(){
		return rInvoicehsn.get();
	}
	public void setRInvoicehsn(String val)
	{
		rInvoicehsn.set(val);		
	}
	
	public String getRTaxablevalue(){
		return rTaxablevalue.get();
	}
	public void setRTaxablevalue(String val)
	{
		rTaxablevalue.set(val);		
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
	//st
	public String getRPoc(){
		return rPoc.get();
	}
	public void setRPoc(String val)
	{
		rPoc.set(val);		
	}
	public String getRItc(){
		return rItc.get();
	}
	public void setRItc(String val)
	{
		rItc.set(val);		
	}
	public String getRIgstamount1(){
		return rIgstamount1.get();
	}
	public void setRIgstamount1(String val)
	{
		rIgstamount1.set(val);		
	}
	public String getRCgstamount1(){
		return rCgstamount1.get();
	}
	public void setRCgstamount1(String val)
	{
		rCgstamount1.set(val);		
	}
	public String getRSgstamount1(){
		return rSgstamount1.get();
	}
	public void setRSgstamount1(String val)
	{
		rSgstamount1.set(val);		
	}
	public String getRIgstamount2(){
		return rIgstamount2.get();
	}
	public void setRIgstamount2(String val)
	{
		rIgstamount2.set(val);		
	}
	public String getRSgstamount2(){
		return rSgstamount2.get();
	}
	public void setRSgstamount2(String val)
	{
		rSgstamount2.set(val);		
	}
	
	public String getRPopulate(){
		return rPopulate.get();
	}
	public void setRPopulate(String val)
	{
		rPopulate.set(val);		
	}
	
	public String getRCgstamount2(){
		return rCgstamount2.get();
	}
	public void setRCgstamount2(String val)
	{
		rCgstamount2.set(val);		
	}
	
	
	//en
	
	
	
	public String getRReverse(){
		return rReverse.get();
	}
	public void setRReverse(String val)
	{
		rReverse.set(val);		
	}

}
