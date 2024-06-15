package trabajoAutonomo;

import javax.swing.*;
import java.util.Hashtable;
import java.util.Map;

public class Diez {
    
    public static void main(String[] args) {
        Diez programa = new Diez();
        programa.iniciar();
    }

    private void iniciar() {
        int opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    contarFrecuenciaCaracteres();
                    break;
                case 2:
                    manejarInformacionEstudiantes();
                    break;
                case 3:
                    traductorInglesEspanol();
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

    private int mostrarMenu() {
        String menu = "===== Menú =====\n"
                + "1. Contar frecuencia de caracteres\n"
                + "2. Manejar información de estudiantes\n"
                + "3. Traductor inglés-español\n"
                + "0. Salir\n"
                + "Ingrese su opción: ";
        String opcionStr = JOptionPane.showInputDialog(menu);
        return validarEntradaNumerica(opcionStr) ? Integer.parseInt(opcionStr) : -1;
    }

    private boolean validarEntradaNumerica(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida, por favor ingrese un número.");
            return false;
        }
    }

    // Ejercicio 1: Contar la frecuencia de caracteres en una cadena
    private void contarFrecuenciaCaracteres() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto:");
        Hashtable<Character, Integer> frecuenciaCaracteres = new Hashtable<>();

        for (char c : cadena.toCharArray()) {
            frecuenciaCaracteres.put(c, frecuenciaCaracteres.getOrDefault(c, 0) + 1);
        }

        StringBuilder resultado = new StringBuilder("Frecuencia de caracteres:\n");
        for (Map.Entry<Character, Integer> entrada : frecuenciaCaracteres.entrySet()) {
            resultado.append(entrada.getKey()).append(": ").append(entrada.getValue()).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    // Ejercicio 2: Almacenar y recuperar información de estudiantes
    private void manejarInformacionEstudiantes() {
        Hashtable<String, String> estudiantes = new Hashtable<>();
        int opcion;
        do {
            String menu = "===== Gestión de Estudiantes =====\n"
                    + "1. Agregar estudiante\n"
                    + "2. Buscar estudiante\n"
                    + "3. Eliminar estudiante\n"
                    + "0. Volver al menú principal\n"
                    + "Ingrese su opción: ";
            String opcionStr = JOptionPane.showInputDialog(menu);
            opcion = validarEntradaNumerica(opcionStr) ? Integer.parseInt(opcionStr) : -1;

            switch (opcion) {
                case 1:
                    agregarEstudiante(estudiantes);
                    break;
                case 2:
                    buscarEstudiante(estudiantes);
                    break;
                case 3:
                    eliminarEstudiante(estudiantes);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor ingrese nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    private void agregarEstudiante(Hashtable<String, String> estudiantes) {
        String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        estudiantes.put(id, nombre);
        JOptionPane.showMessageDialog(null, "Estudiante agregado exitosamente.");
    }

    private void buscarEstudiante(Hashtable<String, String> estudiantes) {
        String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante a buscar:");
        String nombre = estudiantes.get(id);
        if (nombre != null) {
            JOptionPane.showMessageDialog(null, "Estudiante encontrado: " + nombre);
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }

    private void eliminarEstudiante(Hashtable<String, String> estudiantes) {
        String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante a eliminar:");
        if (estudiantes.remove(id) != null) {
            JOptionPane.showMessageDialog(null, "Estudiante eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }

    // Ejercicio 3: Traductor de palabras
    private void traductorInglesEspanol() {
        Hashtable<String, String> diccionario = new Hashtable<>();
        diccionario.put("hello", "hola");
        diccionario.put("world", "mundo");
        diccionario.put("computer", "computadora");
        diccionario.put("program", "programa");
        diccionario.put("java", "java");

        String palabraIngles = JOptionPane.showInputDialog("Ingrese una palabra en inglés para traducir:");
        String palabraEspanol = diccionario.get(palabraIngles.toLowerCase());
        
        if (palabraEspanol != null) {
            JOptionPane.showMessageDialog(null, "La traducción de '" + palabraIngles + "' es: " + palabraEspanol);
        } else {
            JOptionPane.showMessageDialog(null, "La palabra no se encuentra en el diccionario.");
        }
    }
}
