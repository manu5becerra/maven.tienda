package codigo.models;

import codigo.cfg.Config;

public class Persona {
	
	private int id = 0;
	private String name = "";
	private int edad = 18;
	private int sueldo = 100;
	
	public boolean esMayor() {
		return (this.edad >= 18);
	}
	
	public void setEdad(int nuevaEdad) {
		if (nuevaEdad <= 0) {
			return;
		}
		this.edad = nuevaEdad;
	}
	 
	public int getId() {
		return this.id;
	}
	
	public int sueldoBruto() {
		 
		int  iva = Config.IVA;
		return this.sueldo + ( (this.sueldo * iva) / 100 );
	}

}
