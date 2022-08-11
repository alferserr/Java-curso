package domain;

public class Empleado extends Persona {
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;

	public Empleado(){
		//super();
		this.idEmpleado = ++ Empleado.contadorEmpleado;
	}
	
	public Empleado(String nombre, double sueldo){
		//super(nombre);
		this(); // Llama al constructor vacío de esta clase
		this.nombre = nombre;
		this.sueldo = sueldo;

	}
	
	public int getIdEmpleado(){
		return this.idEmpleado;
	}
	
	public double getSueldo(){
		return this.sueldo;
	}
	
	public void setSueldo(double sueldo){
		this.sueldo = sueldo;
	}
	
	public static int getContadorEmpleado(){
		return Empleado.contadorEmpleado;
	}
	
	public static void setContadorEmpleado(int contadorEmpleado){
		Empleado.contadorEmpleado = contadorEmpleado;
	}
	
	@Override
	public String toString(){
		return "Empleado { idEmpleado= " + idEmpleado + ", " + "sueldo= " + sueldo +" } " + super.toString();
	}
}