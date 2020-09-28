package codigo.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DbObject {
	
	private Conexion ctx = Conexion.getInstance();
	 
	public abstract int   getId();
	public abstract String   getTable();
	public abstract String[] getCols();
	public abstract String[] getValues();
	
	public void insertar() throws SQLException { 
		ctx.insertar(getTable(), getCols(), getValues());
		
	}
	
	public void list() throws SQLException {
		ResultSet rs = ctx.select(getTable());
		while (rs.next()) {
			// read the result set
			System.out.println("name = " + rs.getString("name"));
		}
	}
	
	public void update() throws SQLException { 
		ctx.update(getTable(), getId(), getCols(), getValues());
	}
	
	public void delete() throws SQLException {
		ctx.delete(getTable(), getId());
	}
	
}
