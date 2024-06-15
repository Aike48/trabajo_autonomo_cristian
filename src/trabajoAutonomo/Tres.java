package trabajoAutonomo;

public class Tres {

    public static void main(String[] args) {
        // Ejercicio 1
        int numero = -5;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Ejercicio 2
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Ejercicio 3
        int numero2 = 4;
        if (numero2 % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
