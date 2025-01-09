public class Estudiante {

    /**
     * @author Miguel Macias del Pino
     */
    private String matricula;
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String matricula, String nombre, int edad, double promedio) {
        this.matricula = matricula;
        this.edad = edad;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    // Aqui podemos ver los getters para las diferentes variables de instancia
    public String getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    // Aqui tenemos los setters para las diferentes variables de instancia
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else
            this.edad = 0;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPromedio(double promedio) {
        if (promedio > 0.0 && promedio < 10.0) {
            this.promedio = promedio;
        } else {
            this.promedio = 0;
        }
    }

    // Aqui lo tenemos para saber el promedio mayor
    public static String maspromedio(Estudiante alumno1, Estudiante alumno2) {
        if (alumno1.getPromedio() > alumno2.getPromedio()) {
            return "El alumnos con mas Promedios es el Alumno 1 ";
        } else {
            return "El alumnos con mas Promedios es el Alumno 2 ";
        }

    }

    // Aqui tenemos el texto en el cual enseñamos al alumno
    public String toString() {
        return "Estudiante[ matricula" + matricula + ", nombre = " + nombre + ", Edad =" + edad + ", promedio ="
                + promedio + "]";
    }

}
