package trabajoAutonomo;
public class Uno {

	public static void main(String[] args) {
	// Ejerccio 1
		int edad = 25;
        double salario = 8500.50;
        char inicial = 'A';
        boolean esEstudiante = false;

        // Imprimir los valores de las variables
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Inicial: " + inicial);
        System.out.println("Es estudiante: " + esEstudiante);
	
	// Ejercicio 2
        double radio = 7.5;
        double area;

        // Cálculo del área del círculo
        area = Math.PI * radio * radio;

        // Imprimir el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
	
	// Ejercicio 3
        int numero1 = 10;
        int numero2 = 20;
        boolean sonIguales;

        // Comparación de valores
        sonIguales = (numero1 == numero2);

        // Imprimir el resultado
        if (sonIguales) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
        }

	}

}
