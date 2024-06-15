package trabajoAutonomo;

public class Cinco {

    public static void main(String[] args) {
        // Ejercicio 1
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Ejercicio 2
        int suma = 0, j = 1;
        while (j <= 10) {
            suma += j;
            j++;
        }
        System.out.println("La suma de los primeros 10 números naturales es: " + suma);

        // Ejercicio 3
        int k = 10;
        while (k >= 1) {
            System.out.println(k);
            k--;
        }
    }
}
