public class Persona{
	private int idPersona;
	private String nombre;
	private static int contadorPersona;
	
	public Persona(String nombre){
		this.nombre = nombre;
		// Incrementar el contador por cada objeto nuevo.
		Persona.contadorPersona++; // Al ser una variable estatica, esta se asocia con la clase por lo que es recomendable poner el nombre de la clase en vez de this.
		// Asignar nuevo valor a la variable idPersona.
		this.idPersona = Persona.contadorPersona;
	} 
	
	public int getIdPersona(){
		return idPersona;
	}
	
	public void setIdPersona(int idPersona){
		this.idPersona = idPersona;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public static int getContadorPersona(){
		return contadorPersona;
	}
	
	public static void setContadorPersona(int aContadorPersona){ // This no se puede usar en un contexto estático.
		contadorPersona = aContadorPersona;
	}
	
	@Override //Esto significa que estamos sobreescribiendo el metodo toString.
	public String toString(){
		return "Persona{" + " idPersona= " + idPersona + ", " + "nombre= " + nombre + " }";
	}
}