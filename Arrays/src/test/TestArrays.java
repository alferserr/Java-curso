package test;

public class TestArrays {
    public static void main(String[] args) {
        int[] edades = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 10;
        System.out.println("edades0 = " + edades[0]);

        //edades[3] = 5;

        for(int i = 0; i < edades.length; i++ ){ // Con esto se recorre las posiciones de memoria del array, no se modifican los valores
            System.out.println("edades elemnto " + i + ": "  + edades[i]);
        }
    }
}
