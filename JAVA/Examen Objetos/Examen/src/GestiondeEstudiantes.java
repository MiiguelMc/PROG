public class GestiondeEstudiantes {

    /**
     * @author Miguel Macias del Pino
     */
    String matricula = "";
    String nombre = "";
    int edad = 0;
    double promedio = 0;

    // Aqui tenemos para registrar el alumno
    public static Estudiante registrarEstudiantes() {
        String matricula = "";
        String nombre = "";
        int edad = 0;
        double promedio = 0;

        System.out.println("Introduzca su nombre");
        nombre = System.console().readLine();

        System.out.println("Introduzca su matricula");
        matricula = System.console().readLine();

        boolean estudiantee = true;
        while (estudiantee) {
            try {
                System.out.println("Introduzca su Edad");
                edad = Integer.parseInt(System.console().readLine());
                estudiantee = false;
            } catch (Exception e) {
                System.out.println("Porfavor introduzca los Caracteres pedidos");
            }
        }
        boolean estudianteee = true;
        while (estudianteee) {
            try {
                System.out.println("Introduzca su promedio");
                promedio = Integer.parseInt(System.console().readLine());
                estudianteee = false;
            } catch (Exception e) {
                System.out.println("Porfavor introduzca los Caracteres pedidos");
            }
        }

        Estudiante p1 = new Estudiante(matricula, nombre, edad, promedio);
        return p1;
    }

    public String mostrarEstudiante(Estudiante estudiante) {

        return toString();
    }

}
