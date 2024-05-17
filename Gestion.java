import java.util.ArrayList;

public class Gestion{
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(String nombre, String apellido, int edad, String codigo) {
        Estudiante estudiante = new Estudiante(nombre, apellido, edad, codigo);
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado con éxito.");
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes registrados:");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    public void buscarEstudiantePorCodigo(String codigo) {
        boolean encontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                System.out.println("Estudiante encontrado: " + estudiante);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un estudiante con el código de estudiante proporcionado.");
        }
    }
}
