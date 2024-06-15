
package trabajoAutonomo;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Nueve {

    public static void main(String[] args) {
        int opcionPrincipal;

        do {
            String menuPrincipal = "===== Menú Principal =====\n"
                    + "1. Gestión de Tareas\n"
                    + "2. Promedio de Calificaciones\n"
                    + "3. Gestión de Profesores y Estudiantes\n"
                    + "0. Salir\n"
                    + "Ingrese su opción: ";
            String opcionPrincipalStr = JOptionPane.showInputDialog(menuPrincipal);
            if (opcionPrincipalStr == null) {
                opcionPrincipal = 0; // Salir si se cancela el diálogo
            } else {
                opcionPrincipal = Integer.parseInt(opcionPrincipalStr);

                switch (opcionPrincipal) {
                    case 1:
                        gestionTareas();
                        break;
                    case 2:
                        promedioCalificaciones();
                        break;
                    case 3:
                        gestionProfesoresEstudiantes();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida, por favor ingrese nuevamente.");
                        break;
                }
            }
        } while (opcionPrincipal != 0);
    }

    // Ejercicio 1: Gestión de Tareas
    public static void gestionTareas() {
        ArrayList<String> tareas = new ArrayList<>();
        int opcion;

        do {
            String menu = "===== Gestión de Tareas =====\n"
                    + "1. Agregar tarea\n"
                    + "2. Marcar tarea como completada\n"
                    + "3. Mostrar tareas\n"
                    + "4. Volver al Menú Principal\n"
                    + "Ingrese su opción: ";
            String opcionStr = JOptionPane.showInputDialog(menu);
            if (opcionStr == null) {
                opcion = 4; // Volver si se cancela el diálogo
            } else {
                opcion = Integer.parseInt(opcionStr);

                switch (opcion) {
                    case 1:
                        String tareaAgregar = JOptionPane.showInputDialog("Ingrese la tarea a agregar:");
                        if (tareaAgregar != null && !tareaAgregar.trim().isEmpty()) {
                            tareas.add(tareaAgregar);
                            JOptionPane.showMessageDialog(null, "Tarea agregada.");
                        }
                        break;
                    case 2:
                        String tareaCompletada = JOptionPane.showInputDialog("Ingrese el número de la tarea completada (1-" + tareas.size() + "):");
                        if (tareaCompletada != null) {
                            int numTarea = Integer.parseInt(tareaCompletada);
                            if (numTarea > 0 && numTarea <= tareas.size()) {
                                tareas.remove(numTarea - 1);
                                JOptionPane.showMessageDialog(null, "Tarea completada y eliminada.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Número de tarea inválido.");
                            }
                        }
                        break;
                    case 3:
                        StringBuilder listaTareas = new StringBuilder("Lista de tareas:\n");
                        for (int i = 0; i < tareas.size(); i++) {
                            listaTareas.append(i + 1).append(". ").append(tareas.get(i)).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, listaTareas.toString());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Volviendo al Menú Principal...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                        break;
                }
            }
        } while (opcion != 4);
    }

    // Ejercicio 2: Promedio de Calificaciones
    public static void promedioCalificaciones() {
        ArrayList<Double> calificaciones = new ArrayList<>();
        int opcion;

        do {
            String menu = "===== Promedio de Calificaciones =====\n"
                    + "1. Agregar calificación\n"
                    + "2. Calcular y mostrar promedio\n"
                    + "3. Mostrar todas las calificaciones\n"
                    + "4. Volver al Menú Principal\n"
                    + "Ingrese su opción: ";
            String opcionStr = JOptionPane.showInputDialog(menu);
            if (opcionStr == null) {
                opcion = 4; // Volver si se cancela el diálogo
            } else {
                opcion = Integer.parseInt(opcionStr);

                switch (opcion) {
                    case 1:
                        String calificacionStr = JOptionPane.showInputDialog("Ingrese la calificación:");
                        if (calificacionStr != null) {
                            double calificacion = Double.parseDouble(calificacionStr);
                            calificaciones.add(calificacion);
                            JOptionPane.showMessageDialog(null, "Calificación agregada.");
                        }
                        break;
                    case 2:
                        if (calificaciones.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No hay calificaciones para calcular el promedio.");
                        } else {
                            double suma = 0;
                            for (double nota : calificaciones) {
                                suma += nota;
                            }
                            double promedio = suma / calificaciones.size();
                            JOptionPane.showMessageDialog(null, "El promedio de las calificaciones es: " + promedio);
                        }
                        break;
                    case 3:
                        StringBuilder listaCalificaciones = new StringBuilder("Lista de calificaciones:\n");
                        for (double nota : calificaciones) {
                            listaCalificaciones.append(nota).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, listaCalificaciones.toString());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Volviendo al Menú Principal...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                        break;
                }
            }
        } while (opcion != 4);
    }

    // Ejercicio 3: Gestión de Profesores y Estudiantes
    public static void gestionProfesoresEstudiantes() {
        ArrayList<String> listaProfesores = new ArrayList<>();
        ArrayList<ArrayList<String>> listaGeneralEstudiantes = new ArrayList<>();
        int opcion;

        do {
            String menu = "===== Gestión de Profesores y Estudiantes =====\n"
                    + "1. Registrar profesores\n"
                    + "2. Registrar estudiantes asociados al profesor\n"
                    + "3. Consultar lista total de profesores y sus estudiantes asociados\n"
                    + "4. Consultar un profesor e imprimir la lista de estudiantes asociados\n"
                    + "5. Consultar un profesor e indicar la cantidad de estudiantes asociados\n"
                    + "6. Consultar un estudiante e indicar cuál es su director de grupo\n"
                    + "7. Volver al Menú Principal\n"
                    + "Ingrese su opción: ";
            String opcionStr = JOptionPane.showInputDialog(menu);
            if (opcionStr == null) {
                opcion = 7; // Volver si se cancela el diálogo
            } else {
                opcion = Integer.parseInt(opcionStr);

                switch (opcion) {
                    case 1:
                        registrarProfesores(listaProfesores, listaGeneralEstudiantes);
                        break;
                    case 2:
                        registrarEstudiantes(listaProfesores, listaGeneralEstudiantes);
                        break;
                    case 3:
                        consultarListaProfesoresyEstudiantes(listaProfesores, listaGeneralEstudiantes);
                        break;
                    case 4:
                        consultarProfesor(listaProfesores, listaGeneralEstudiantes);
                        break;
                    case 5:
                        consultarCantidadEstudiantesPorProfesor(listaProfesores, listaGeneralEstudiantes);
                        break;
                    case 6:
                        consultarDirectorGrupo(listaProfesores, listaGeneralEstudiantes);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Volviendo al Menú Principal...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                        break;
                }
            }
        } while (opcion != 7);
    }

    private static boolean validarEntradaNumerica(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida, por favor ingrese un número.");
            return false;
        }
    }

    private static void registrarProfesores(ArrayList<String> listaProfesores, ArrayList<ArrayList<String>> listaGeneralEstudiantes) {
        String cantProfesoresStr = JOptionPane.showInputDialog("Ingrese la cantidad de profesores a registrar:");
        if (!validarEntradaNumerica(cantProfesoresStr)) {
            return;
        }

        int cantProfesores = Integer.parseInt(cantProfesoresStr);
        for (int i = 0; i < cantProfesores; i++) {
            String nombreProfesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor " + (i + 1) + ":");
            if (listaProfesores.contains(nombreProfesor)) {
                JOptionPane.showMessageDialog(null, "El profesor ya está registrado.");
                i--; // Para que se vuelva a pedir el nombre del profesor
            } else {
                listaProfesores.add(nombreProfesor);
                listaGeneralEstudiantes.add(new ArrayList<>());
            }
        }

        JOptionPane.showMessageDialog(null, "Profesores registrados exitosamente.");
    }

    private static void registrarEstudiantes(ArrayList<String> listaProfesores, ArrayList<ArrayList<String>> listaGeneralEstudiantes) {
        if (listaProfesores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe registrar al menos un profesor antes de registrar estudiantes.");
            return;
        }

        String nombreProfesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor:");

        if (!listaProfesores.contains(nombreProfesor)) {
            JOptionPane.showMessageDialog(null, "El profesor no está registrado.");
            return;
        }

        int indiceProfesor = listaProfesores.indexOf(nombreProfesor);

        String cantEstudiantesStr = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes para el profesor " + nombreProfesor + ":");
        if (!validarEntradaNumerica(cantEstudiantesStr)) {
            return;
        }

        int cantEstudiantes = Integer.parseInt(cantEstudiantesStr);

        ArrayList<String> estudiantes = listaGeneralEstudiantes.get(indiceProfesor);
        for (int i = 0; i < cantEstudiantes; i++) {
            String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i + 1) + ":");

            if (estudiantes.contains(nombreEstudiante)) {
                JOptionPane.showMessageDialog(null, "El estudiante ya está registrado.");
                i--; // Para que se vuelva a pedir el nombre del estudiante
            } else {
                estudiantes.add(nombreEstudiante);
            }
        }

        JOptionPane.showMessageDialog(null, "Estudiantes registrados exitosamente.");
    }

    private static void consultarListaProfesoresyEstudiantes(ArrayList<String> listaProfesores, ArrayList<ArrayList<String>> listaGeneralEstudiantes) {
        if (listaProfesores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay profesores registrados.");
            return;
        }

        String resultado = "===== Lista de Profesores y Estudiantes =====\n";
        for (int i = 0; i < listaProfesores.size(); i++) {
            resultado += "Profesor: " + listaProfesores.get(i) + "\n";
            resultado += "Estudiantes:\n";
            ArrayList<String> estudiantes = listaGeneralEstudiantes.get(i);
            if (estudiantes.isEmpty()) {
                resultado += "- No hay estudiantes registrados\n";
            } else {
                for (String estudiante : estudiantes) {
                    resultado += "- " + estudiante + "\n";
                }
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    private static void consultarProfesor(ArrayList<String> listaProfesores, ArrayList<ArrayList<String>> listaGeneralEstudiantes) {
        if (listaProfesores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay profesores registrados.");
            return;
        }

        String nombreProfesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor a consultar:");

        int indiceProfesor = listaProfesores.indexOf(nombreProfesor);
        if (indiceProfesor == -1) {
            JOptionPane.showMessageDialog(null, "El profesor no está registrado.");
        } else {
            String resultado = "Estudiantes asociados al profesor " + nombreProfesor + ":\n";
            ArrayList<String> estudiantes = listaGeneralEstudiantes.get(indiceProfesor);
            if (estudiantes.isEmpty()) {
                resultado += "- No hay estudiantes registrados\n";
            } else {
                for (String estudiante : estudiantes) {
                    resultado += "- " + estudiante + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    private static void consultarCantidadEstudiantesPorProfesor(ArrayList<String> listaProfesores, ArrayList<ArrayList<String>> listaGeneralEstudiantes) {
        if (listaProfesores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay profesores registrados.");
            return;
        }

        String nombreProfesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor a consultar:");

        int indiceProfesor = listaProfesores.indexOf(nombreProfesor);
        if (indiceProfesor == -1) {
            JOptionPane.showMessageDialog(null, "El profesor no está registrado.");
        } else {
            ArrayList<String> estudiantes = listaGeneralEstudiantes.get(indiceProfesor);
            JOptionPane.showMessageDialog(null, "Cantidad de estudiantes asociados al profesor " + nombreProfesor + ": " + estudiantes.size());
        }
    }

    private static void consultarDirectorGrupo(ArrayList<String> listaProfesores, ArrayList<ArrayList<String>> listaGeneralEstudiantes) {
        if (listaProfesores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay profesores registrados.");
            return;
        }

        String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar:");

        String directorGrupo = null;
        for (int i = 0; i < listaGeneralEstudiantes.size(); i++) {
            ArrayList<String> estudiantes = listaGeneralEstudiantes.get(i);
            if (estudiantes.contains(nombreEstudiante)) {
                directorGrupo = listaProfesores.get(i);
                break;
            }
        }

        if (directorGrupo == null) {
            JOptionPane.showMessageDialog(null, "El estudiante no está asociado a ningún profesor.");
        } else {
            JOptionPane.showMessageDialog(null, "El director de grupo del estudiante " + nombreEstudiante + " es: " + directorGrupo);
        }
    }
}
