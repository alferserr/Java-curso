public class PasoPorReferencia{
	public static void main(String[] args){
		 Persona p1 = new Persona();
		 p1.nombre = "Juan";
		 System.out.println("p1 nombre:" + p1.nombre);
		 cambiaValor(p1);
		 System.out.println("p1 cambio de nombre a : " + p1.nombre);
	}
	
	public static void cambiaValor(Persona persona){
		persona.nombre = "Karla";
	}
}