package codigo.db;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class  ConfigDB {
	
	
	
	public static String DB_CONEXION = "jdbc:sqlite:sample.db";

	public static ArrayList<String> queries = getQueries();

	private static ArrayList<String> getQueries() {
		ArrayList<String> queries = new ArrayList<String>();
		
		queries.add("CREATE TABLE IF NOT EXISTS 'person' ("
				+ "	'id'	INTEGER,"
				+ "	'name'	string,"
				+ "	'lastname'	TEXT,"
				+ "	PRIMARY KEY('id' AUTOINCREMENT)"
				+ ")");
		
		queries.add("CREATE TABLE IF NOT EXISTS 'producto' ("
				+ "	'id'	INTEGER,"
				+ "	'name'	TEXT,"
				+ "	'desc'	TEXT,"
				+ "	'precio' INTEGER DEFAULT 0,"
				+ "	'stock'	INTEGER DEFAULT 1,"
				+ "	PRIMARY KEY('id' AUTOINCREMENT)"
				+ ")");
		
		return queries;
	}

	
}
