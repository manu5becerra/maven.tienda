package codigo;
 
import java.sql.SQLException; 
 
import codigo.models.Persona;

public class Principal {

	public static void main(String[] args) { 
		
		
		try {
			
			Persona per = new Persona();
			per.name     = "Don Jose";
			per.lastname = "Pepito";
			per.setId(1);
			
			per.insertar();
			per.list();
			
			per.name     = "Don";
			per.lastname = "Jose";
			
			per.update();
			per.delete();
			
		}catch(SQLException e) {
			System.out.println( e.getMessage() );
		}  

		// create a database connection

		/*
		 * 
		 * statement.executeUpdate("drop table if exists person");
		 * 
		 * statement.executeUpdate("create table person (id integer, name string)");
		 * 
		 * statement.executeUpdate("insert into person values(1, 'leo')");
		 * statement.executeUpdate("insert into person values(2, 'yui')");
		 * 
		 * 
		 * 
		 * ResultSet rs = statement.executeQuery("select * from person");
		 * while(rs.next()) { // read the result set System.out.println("name = " +
		 * rs.getString("name")); }
		 * 
		 * 
		 * //
		 */

	}

}
