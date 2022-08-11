public class PersonaPrueba{
	private int contador;
	
	public static void main(String[] args){
		Persona p1 = new Persona("Juan");
		//System.out.println("p1= " + p1);
		Persona p2 = new Persona("Karla");
		//System.out.println("p2 = " + p2);\
		imprimir(p1);
		imprimir(p2);
		
	}
	
	public static void imprimir(Persona persona){
		System.out.println("persona= " + persona);
	}
	
	public int getContador(){
		imprimir(new Persona("Carlos"));
		return this.contador;
	}
}