package domain;

public class Empleado extends Persona{

    @Override //Sirve para avisar de que se esta sobreescribiendo en este caso un metodo creado en otra clase
    public void imprimir(){
        System.out.println("Metodo imprimir desde clase hija");
    }
}
