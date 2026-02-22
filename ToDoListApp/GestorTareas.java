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
}
