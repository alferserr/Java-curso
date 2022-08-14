package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args){
        int[][] edades = new int[3][2]; // el primer corchete(3) recorre el array de arriba a abajo
                                        // y el otro de izquierda a derecha
        System.out.println(edades);
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;

        System.out.println(edades[0][0]);

        for(int columna = 0; columna < edades.length; columna++){ // De arriba a abajo
            for (int fila = 0; fila < edades[columna].length; fila++){ // De izquierda a derecha
                System.out.println("edades " + columna + "-" + fila + ": " + edades[columna][fila]);
            }
        }

        String[][] frutas = {{"Naranja","Limon"},{"Fresa", "Zarzamora"}};
        imprimir(frutas);
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Javier");
        personas[1][0] = new Persona("Alex");
        personas[1][1] = new Persona("Miriam");
        personas[1][2] = new Persona("Maria");
        imprimir(personas);

    }
    public static void imprimir(Object matriz[][]){ // Metodo para imprimir las matrizes. Al ser de tipo
        // Objects puede imprimir matrizes de cualquier clase dado que la clase Objects es la clase
        // padre de todas
        for (int columnas = 0; columnas < matriz.length; columnas++){
            for (int filas = 0; filas < matriz[columnas].length; filas++){
                System.out.println("matriz " + columnas + "-" + filas + ": " + matriz[columnas][filas] );
            }
        }
    }
}
