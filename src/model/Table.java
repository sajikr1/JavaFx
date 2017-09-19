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
	private final SimpleStringProperty rName;
/*	private final SimpleStringProperty rDate;
	private final SimpleIntegerProperty rPrice;
*/	
	public Table(int rID, String rName){//, String rDate, Integer rPrice){
		this.rID = new SimpleIntegerProperty(rID);
		this.rName = new SimpleStringProperty(rName);
		/*this.rDate= new SimpleStringProperty(rDate);
		this.rPrice = new SimpleIntegerProperty(rPrice);
		*/
	}
	
	public Integer getRID(){
		return rID.get();
	}
	public void setRID(Integer val)
	{
		rID.set(val);		
	}
	
	public String getRName(){
		return rName.get();
	}
	public void setRName(String val)
	{
		rName.set(val);		
	}
}
