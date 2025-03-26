public class SistemaGestorEstudiantes {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Estudiante estudiantes[];
        GestorEstudiantes estudiante = new GestorEstudiantes();
        System.out.println("Sistema de gestion de estudiante ");
        int condicion = 0;
        while (condicion < 6) {
            System.out.println("1º Agregar Estudiante");
            System.out.println("2º Agregar nota a estudiante ");
            System.out.println("3º Mostrar informacion de todos los estudiantes ");
            System.out.println("4º Mostrar estudiantes con promedio ");
            System.out.println("5º Buscar estudiante nombre ");
            System.out.println("6º Salir");
            condicion = Integer.parseInt(System.console().readLine());
            switch (condicion) {
                case 1:
                    System.out.println("Digame el nombre del estudiante");
                    String nombre = System.console().readLine();
                    estudiante.agregarEstudiante(nombre);
                    break;
                case 2:
                    System.out.println("Dime el nombre del Estudiante");
                    String nombrenota = System.console().readLine();
                    System.out.println("Dime la nota");
                    double nota = Double.parseDouble(System.console().readLine());
                    estudiante.agregarNotasEstudiante(nombrenota, nota);
                    break;
                case 3:
                    estudiante.MostrarEstudiante();
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Dime el nombre de quien busca ");
                    String nombreestudiante = System.console().readLine();
                    Estudiante Estudiante5 = estudiante.Buscarestudiante(nombreestudiante);
                    System.out.println(Estudiante5);
                    break;

                default:
                    break;
            }
        }
    }

}
