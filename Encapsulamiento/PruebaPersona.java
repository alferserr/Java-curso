public class PruebaPersona{
	public static void main(String[] args){
		Persona p1 = new Persona("Juan",5000.00,false);
		p1.setNombre("Juan Carlos");
		//System.out.println("p1 nombre: " + p1.getNombre());
		//System.out.println("p1 sueldo: " + p1.getSueldo());
		//System.out.println("p1 eliminado " + p1.isEliminado());
		System.out.println("p1: " + p1); // También se puede poner p1.toString(); 
	}
}