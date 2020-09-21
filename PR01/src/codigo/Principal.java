package codigo;

import codigo.models.Persona;

public class Principal {

	public static void main(String[] args) { 
		
		Persona per = new Persona();
		
		per.setEdad(-1240);
		
		if (per.esMayor()) {
			System.out.println("Mayor de Edad");
			int sueldo = per.sueldoBruto();
			System.out.println("Sueldo: "+sueldo);
		}
	 
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("FIN");
	}

}
