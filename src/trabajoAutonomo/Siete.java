package trabajoAutonomo;

public class Siete {

    public static void main(String[] args) {
        // Ejercicio 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Ejercicio 2
        int suma = 0;
        for (int j = 1; j <= 10; j++) {
            suma += j;
        }
        System.out.println("La suma de los primeros 10 números naturales es: " + suma);

        // Ejercicio 3
        int[] arreglo = {1, 2, 3, 4, 5};
        for (int k = 0; k < arreglo.length; k++) {
            System.out.println("Elemento en el índice " + k + ": " + arreglo[k]);
        }
    }
}

