package ToDoListApp;
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
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
}
