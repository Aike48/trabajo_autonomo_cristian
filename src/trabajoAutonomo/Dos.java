package trabajoAutonomo;

public class Dos {
	public static void main(String[] args) {
        // Ejercicio 1
        final double PI = 3.14159;
        double radio = 5.0;
        double area = PI * radio * radio;

        System.out.println("El área del círculo es: " + area);

        // Ejercicio 2
        System.out.println("Días en una semana: " + Constantes.DIAS_SEMANA);
        System.out.println("Horas en un día: " + Constantes.HORAS_DIA);

        // Ejercicio 3
        double precioSinIVA = 100.0;
        double precioConIVA = Calculadora.calcularPrecioConIVA(precioSinIVA);

        System.out.println("El precio con IVA es: " + precioConIVA);
    }
}

// Clase para las constantes del ejercicio 2
class Constantes {
    public static final int DIAS_SEMANA = 7;
    public static final int HORAS_DIA = 24;
}

// Clase para los métodos del ejercicio 3
class Calculadora {
    public static final double IVA = 0.19;

    public static double calcularPrecioConIVA(double precioSinIVA) {
        return precioSinIVA * (1 + IVA);
    }
	
}
