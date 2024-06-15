package trabajoAutonomo;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Once {

    public static void main(String[] args) {
        int opcionPrincipal;

        do {
            opcionPrincipal = mostrarMenuPrincipal();
            switch (opcionPrincipal) {
                case 1:
                    frecuenciaPalabras();
                    break;
                case 2:
                    agendaContactos();
                    break;
                case 3:
                    calificacionesEstudiantes();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor ingrese nuevamente.");
                    break;
            }
        } while (opcionPrincipal != 0);
    }

    private static int mostrarMenuPrincipal() {
        String menu = "===== Menú Principal =====\n"
                + "1. Contar frecuencia de palabras en una frase\n"
                + "2. Agenda de contactos\n"
                + "3. Calificaciones de estudiantes\n"
                + "0. Salir\n"
                + "Ingrese su opción: ";
        String opcionStr = JOptionPane.showInputDialog(menu);
        return opcionStr == null ? 0 : Integer.parseInt(opcionStr);
    }

    // Ejercicio 1: Contar frecuencia de palabras en una frase
    private static void frecuenciaPalabras() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        // Creación de un HashMap para almacenar la frecuencia de las palabras
        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();

        // Dividindo la frase en palabras
        String[] palabras = frase.split("\\s+");

        // Contando la frecuencia de cada palabra
        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }

        // Mostrar el resultado
        StringBuilder resultado = new StringBuilder("Frecuencia de palabras:\n");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            resultado.append(entrada.getKey()).append(": ").append(entrada.getValue()).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    // Ejercicio 2: Agenda de contactos
    private static void agendaContactos() {
        HashMap<String, String> agenda = new HashMap<>();
        int opcion;

        do {
            opcion = mostrarMenuAgenda();
            switch (opcion) {
                case 1:
                    agregarContacto(agenda);
                    break;
                case 2:
                    buscarContacto(agenda);
                    break;
                case 3:
                    eliminarContacto(agenda);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor ingrese nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    private static int mostrarMenuAgenda() {
        String menu = "===== Menú Agenda =====\n"
                + "1. Agregar contacto\n"
                + "2. Buscar contacto\n"
                + "3. Eliminar contacto\n"
                + "0. Salir\n"
                + "Ingrese su opción: ";
        String opcionStr = JOptionPane.showInputDialog(menu);
        return opcionStr == null ? 0 : Integer.parseInt(opcionStr);
    }

    private static void agregarContacto(HashMap<String, String> agenda) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto:");
        String telefono = JOptionPane.showInputDialog("Ingrese el número de teléfono:");
        agenda.put(nombre, telefono);
        JOptionPane.showMessageDialog(null, "Contacto agregado.");
    }

    private static void buscarContacto(HashMap<String, String> agenda) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto a buscar:");
        String telefono = agenda.get(nombre);
        if (telefono != null) {
            JOptionPane.showMessageDialog(null, "Teléfono de " + nombre + ": " + telefono);
        } else {
            JOptionPane.showMessageDialog(null, "El contacto no existe.");
        }
    }

    private static void eliminarContacto(HashMap<String, String> agenda) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto a eliminar:");
        if (agenda.remove(nombre) != null) {
            JOptionPane.showMessageDialog(null, "Contacto eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "El contacto no existe.");
        }
    }

    // Ejercicio 3: Calificaciones de estudiantes
    private static void calificacionesEstudiantes() {
        HashMap<String, Double> calificaciones = new HashMap<>();
        int opcion;

        do {
            opcion = mostrarMenuCalificaciones();
            switch (opcion) {
                case 1:
                    agregarCalificacion(calificaciones);
                    break;
                case 2:
                    consultarCalificacion(calificaciones);
                    break;
                case 3:
                    mostrarCalificaciones(calificaciones);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor ingrese nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    private static int mostrarMenuCalificaciones() {
        String menu = "===== Menú Calificaciones =====\n"
                + "1. Agregar calificación\n"
                + "2. Consultar calificación\n"
                + "3. Mostrar todas las calificaciones\n"
                + "0. Salir\n"
                + "Ingrese su opción: ";
        String opcionStr = JOptionPane.showInputDialog(menu);
        return opcionStr == null ? 0 : Integer.parseInt(opcionStr);
    }

    private static void agregarCalificacion(HashMap<String, Double> calificaciones) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String calificacionStr = JOptionPane.showInputDialog("Ingrese la calificación:");
        Double calificacion = Double.parseDouble(calificacionStr);
        calificaciones.put(nombre, calificacion);
        JOptionPane.showMessageDialog(null, "Calificación agregada.");
    }

    private static void consultarCalificacion(HashMap<String, Double> calificaciones) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        Double calificacion = calificaciones.get(nombre);
        if (calificacion != null) {
            JOptionPane.showMessageDialog(null, "Calificación de " + nombre + ": " + calificacion);
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante no existe.");
        }
    }

    private static void mostrarCalificaciones(HashMap<String, Double> calificaciones) {
        if (calificaciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay calificaciones registradas.");
            return;
        }

        StringBuilder resultado = new StringBuilder("===== Calificaciones de Estudiantes =====\n");
        for (Map.Entry<String, Double> entrada : calificaciones.entrySet()) {
            resultado.append(entrada.getKey()).append(": ").append(entrada.getValue()).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
