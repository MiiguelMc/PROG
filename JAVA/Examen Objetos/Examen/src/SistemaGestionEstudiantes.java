public class SistemaGestionEstudiantes {
    public static void main(String[] args) throws Exception {
        /**
         *@author Miguel Macias del Pino
         */
        System.out.println("Primer Alumno a registrar ");
        Estudiante alumno1 = GestiondeEstudiantes.registrarEstudiantes();
        System.out.println("Segundo Alumno a registrar ");
        Estudiante alumno2 = GestiondeEstudiantes.registrarEstudiantes();
        System.out.println("Aqui tenemos los datos del Primer Alumno");
        System.out.println(alumno1.toString());
        System.out.println("Aqui tenemos los datos del Segundo Alumno");
        System.out.println(alumno2.toString());
        System.out.println("Vamos ha ver quien tiene mas promedio");
        System.out.println(Estudiante.maspromedio(alumno1, alumno2));
    }
}
