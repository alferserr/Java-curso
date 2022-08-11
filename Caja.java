public class Caja{
		int ancho,alto,profundo;
		
		public Caja(){
			System.out.println("Constructor vacio");
		}
		
		public Caja(int ancho,int alto,int profundo){
			this.ancho = ancho;
			this.alto = alto;
			this.profundo = profundo;
		}
		
		public void volumen(){
			int resultado = ancho*alto*profundo;
			System.out.println("El volumen de la caja es: " + resultado);
		}
}