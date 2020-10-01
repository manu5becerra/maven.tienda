package codigo.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DbObject {
	
	private Conexion ctx = Conexion.getInstance();
	 
	public abstract int   getId();
	public abstract String   getTable();
	public abstract String[] getCols();
	public abstract ArrayList<String> getValues();
	public abstract DbObject parse(ResultSet rs) throws SQLException;
	
	public void insertar() throws SQLException { 
		ctx.insertar(getTable(), getCols(), getValues());
		
	}
	
	public ArrayList<DbObject> list() throws SQLException {
		ArrayList<DbObject> lista = new ArrayList<DbObject>();
		ResultSet rs = ctx.select(getTable());
		while (rs.next()) {
			// read the result set
			DbObject obj = this.parse(rs);
			lista.add(obj);
		}
		
		return lista;
	}
	
	public void update() throws SQLException { 
		ctx.update(getTable(), getId(), getCols(), getValues());
	}
	
	public void delete() throws SQLException {
		ctx.delete(getTable(), getId());
	}
	
}
