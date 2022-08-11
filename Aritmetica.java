public class Aritmetica{
	int a,b;
	
	public Aritmetica(){
		System.out.println("Ejecutando constructor");
	}
	
	public Aritmetica(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Ejecutando constructor con argumentos");
	}
	
	public void sumar(){
		int resultado= a+b;
		System.out.println("El resultado es " + resultado);
	}
	
	public int sumarConRetorno(){
		return a+b;
	}
	
	public int sumarConArgumentos(int a, int b){
		this.a=a;
		this.b=b;
		return this.sumarConRetorno();
	}
}