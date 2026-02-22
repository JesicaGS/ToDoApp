package ToDoListApp;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar completada (Pendiente)");
            System.out.println("4. Eliminar tarea (Pendiente)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    String desc = sc.nextLine();
                    gestor.agregarTarea(desc);
                    System.out.println("¡Tarea guardada!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE TAREAS ---");
                    List<Tarea> tareas = gestor.obtenerTareas();
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no implementada o inválida.");
            }
        } while (opcion != 5);
        
        sc.close();
    }
}

