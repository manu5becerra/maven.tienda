package codigo.models; 

import codigo.db.DbObject;  
import java.util.ArrayList;

public class Persona extends DbObject {	 
	 
	private static final String TABLE = "person";
	private static final String[] COLS = {"name", "lastname"};
		
	private int id = 0;
	public String name = "";  
	public String lastname = "";  

	@Override
	public String getTable() { 
		return TABLE;
	} 
	
	@Override
	public String[] getCols() { 
		return COLS;
	}

	@Override
	public String[] getValues() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(this.name);
		list.add(this.lastname);
		return (String[]) list.toArray();
	}

	@Override
	public int getId() { 
		return this.id;
	} 
	
	public void setId(int id) {
		this.id = id;
	}
 
}
