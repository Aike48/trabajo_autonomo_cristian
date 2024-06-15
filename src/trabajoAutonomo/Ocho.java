package trabajoAutonomo;

public class Ocho {

    public static void main(String[] args) {
        // Ejercicio 1
        int[] arreglo = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        System.out.println("La suma del arreglo es: " + suma);

        // Ejercicio 2
        int max = arreglo[0];
        for (int num : arreglo) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("El valor máximo en el arreglo es: " + max);

        // Ejercicio 3
        for (int i = 0; i < arreglo.length / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
        System.out.print("Arreglo invertido: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
