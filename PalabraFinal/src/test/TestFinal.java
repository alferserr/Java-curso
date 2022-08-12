package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;

        //Persona.MI_CONSTANTE = 5;
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);

        final Persona p1 = new Persona();
        //persona1 = new Persona();
        p1.setNombre("Juan");
        System.out.println("p1 nombre = " + p1.getNombre());
    }
}
