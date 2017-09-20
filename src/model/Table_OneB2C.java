package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Table_OneB2C
{

	private final SimpleIntegerProperty rID;
	private final SimpleStringProperty rGoods;
	private final SimpleStringProperty rHsn;
	private final SimpleStringProperty rStatecode;
	private final SimpleStringProperty rTaxableval;
	private final SimpleStringProperty rIgstrate;
	private final SimpleStringProperty rIgstamount;
	private final SimpleStringProperty rCgstrate;
	private final SimpleStringProperty rCgstamount;
	private final SimpleStringProperty rSgstrate;
	private final SimpleStringProperty rSgstamount;
	private final SimpleStringProperty rTaxoninvoice;
	
	public Table_OneB2C(int rID,
		String rGoods,
		String rHsn,
		String rStatecode,
		String rTaxableval,
		String rIgstrate,
		String rIgstamount,
		String rCgstrate,
		String rCgstamount,
		String rSgstrate,
		String rSgstamount,
		String rTaxoninvoice
		){
		this.rID = new SimpleIntegerProperty(rID);
		this.rGoods = new SimpleStringProperty(rGoods);
		this.rHsn=  new SimpleStringProperty(rHsn);
		this.rStatecode=  new SimpleStringProperty(rStatecode);
		this.rTaxableval=  new SimpleStringProperty(rTaxableval);
		this.rIgstrate=  new SimpleStringProperty(rIgstrate);
		this.rIgstamount=  new SimpleStringProperty(rIgstamount);
		this.rCgstrate=  new SimpleStringProperty(rCgstrate);
		this.rCgstamount=  new SimpleStringProperty(rCgstamount);
		this.rSgstrate=  new SimpleStringProperty(rSgstrate);
		this.rSgstamount=  new SimpleStringProperty(rSgstamount);
		this.rTaxoninvoice=  new SimpleStringProperty(rTaxoninvoice);
		
	}
	
	public Integer getRID(){
		return rID.get();
	}
	public void setRID(Integer val)
	{
		rID.set(val);		
	}
	
	public String getRGoods(){
		return rGoods.get();
	}
	public void setRGoods(String val)
	{
		rGoods.set(val);		
	}
	
	public String getRHsn(){
		return rHsn.get();
	}
	public void setRHsn(String val)
	{
		rHsn.set(val);		
	}
	
	public String getRStatecode(){
		return rStatecode.get();
	}
	public void setRStatecode(String val)
	{
		rStatecode.set(val);		
	}
	
	public String getRTaxableval(){
		return rTaxableval.get();
	}
	public void setRTaxableval(String val)
	{
		rTaxableval.set(val);		
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
	public String getRTaxoninvoice(){
		return rTaxoninvoice.get();
	}
	public void setRTaxoninvoice(String val)
	{
		rTaxoninvoice.set(val);		
	}

}

