package domain;

public class Persona {
    private String nombre; // al ser privado para imprimir este atributo en otra clase va a tener que hacerse con el metodo toString()

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Persona {" + "nombre= " + nombre + '}';
    }
}
