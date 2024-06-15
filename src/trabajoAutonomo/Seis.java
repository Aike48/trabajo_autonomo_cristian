package trabajoAutonomo;

import javax.swing.*;

public class Seis {

    public static void main(String[] args) {
    	// Ejercicio 1
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // Ejercicio 2
        int suma = 0, j = 1;
        do {
            suma += j;
            j++;
        } while (j <= 10);
        System.out.println("La suma de los primeros 10 números naturales es: " + suma);
        
        // Ejercicio 3

		int numero = 0;
        do {
            String input = JOptionPane.showInputDialog("Ingrese un número (negativo para salir):");
            if (input == null) {
                break; // Si se cancela el diálogo, salir del bucle
            }
            try {
                numero = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                continue; // Continuar con la siguiente iteración si el número no es válido
            }
        } while (numero >= 0);
        JOptionPane.showMessageDialog(null, "Saliste del bucle.");
    }
}


