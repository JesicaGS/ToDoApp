# Aplicación To-Do-List siguiendo el flujo de trabajo feature branching
- Gestión de Tareas: Agregar, listar, marcar como completadas y eliminar tareas.
- Persistencia: Las tareas se guardan automáticamente en un archivo tareas.txt.

# Historial de Desarrollo (Control de Versiones)

### Fase 1: Base del proyecto

- ffe63dc Implementación inicial para agregar y listar tareas.
- 92d49c1 Incorporación de funciones de marcado y borrado.

### Fase 2: Persistencia y Features

- 73e8f16 Añadida la capacidad de guardar datos en tareas.txt (rama feature/persistencia).

### Fase 3: Optimización y Mantenimiento

- a463139 y 5ad2904 Configuración del archivo .gitignore para mantener el repositorio limpio.
- 44ae7e9 Restricción específica para carpetas generadas por IntelliJ.
- HEAD: 7aec063 Limpieza definitiva del caché de Git para asegurar que los binarios (out/) no se rastreen.

# Conflictos encontrados
Al trabajar en parejas de manera remota, cada uno tenía un IDE diferente, por lo que, el .gitignore no tenía la configuración adecuada para los IDE utilizados (VS Code e IntelliJ).

### ¿Cómo se solucionó?
- Tras realizar una investigación, encontramos el comando: `git rm -r --cached`, el cual permitía eliminar el directorio no deseado del área de preparación de git, y así .gitignore pueda realizar su función.
