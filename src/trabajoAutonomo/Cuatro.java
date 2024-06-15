package trabajoAutonomo;

public class Cuatro {

    public static void main(String[] args) {
        // Ejercicio 1
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
        }

        // Ejercicio 2
        char calificacion = 'B';
        switch (calificacion) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Muy bien");
                break;
            case 'C':
                System.out.println("Bien");
                break;
            case 'D':
                System.out.println("Regular");
                break;
            case 'F':
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("Calificación inválida");
        }

        // Ejercicio 3
        char operador = '+';
        int num1 = 10, num2 = 5;
        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}
