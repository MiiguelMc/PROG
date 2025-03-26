public class GestorEstudiantes {
    
    Estudiante estudiantes[] = new Estudiante[20];
    int cantidadestuadiantes = 0;

    
    /** 
     * @param nombre
     */
    public void agregarEstudiante(String nombre) {
        if (cantidadestuadiantes < 20) {
            estudiantes[cantidadestuadiantes] = new Estudiante(nombre);
            System.out.println("Estudiante Añadido");
            cantidadestuadiantes++;
        } else if (cantidadestuadiantes >= 20) {
            System.out.println("No hay espacio para mas ayudantes ");
        }

    }

    public Estudiante Buscarestudiante(String nombre) {
        int guarda = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (nombre.equals(estudiantes[i].getNombre())) {
                guarda = i;
            }
        }
        return estudiantes[guarda];
    }

    public void agregarNotasEstudiante(String nombre, double notas) {
        if (nombre.equals(Buscarestudiante(nombre).getNombre())) {
            Buscarestudiante(nombre).Agregarnotas(notas);

        } else {
            System.out.println("Estudiante no encontrado");
        }
    }

    public void MostrarEstudiante() {
        for (int i = 0; i < estudiantes.length && estudiantes != null; i++) {
            System.out.println(estudiantes[i]);
        }

    }

}
