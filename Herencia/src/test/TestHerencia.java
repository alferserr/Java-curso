package test;
import domain.Empleado;
import domain.Cliente;
import domain.Persona;

import java.util.Date;

public class TestHerencia{
	public static void main(String[] args){
		Empleado e1 = new Empleado("Juan",5000.0);
		System.out.println("e1 = " + e1);

		//Cliente c1 = new Cliente(new Date(),true,"Karla",'F',28,"Saturno 15");
		//System.out.println(c1);

		//Persona p1 = new Persona();
	}
}