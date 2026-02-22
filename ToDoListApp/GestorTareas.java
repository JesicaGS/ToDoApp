package ToDoListApp;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> listaTareas;
    private final String NOMBRE_ARCHIVO = "tareas.txt";

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
        cargarTareas();
    }

    public void agregarTarea(String descripcion) {
        listaTareas.add(new Tarea(descripcion));
    }

    public List<Tarea> obtenerTareas() {
        return listaTareas;
    }

    public boolean marcarCompletada(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).setCompletada(true);
            return true;
        }
        return false;
    }

    public boolean eliminar(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.remove(indice);
            return true;
        }
        return false;
    }

    public void guardarTareas() {
        try(PrintWriter writer = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (Tarea tarea : listaTareas) {
                writer.println(tarea.getDescripcion() + ";" + tarea.isCompletada());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar las tareas: " + e.getMessage());
        }
    }

    private void cargarTareas() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    Tarea tarea = new Tarea(partes[0]);
                    tarea.setCompletada(Boolean.parseBoolean(partes[1]));
                    listaTareas.add(tarea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar las tareas: " + e.getMessage());
        }
    }
}
