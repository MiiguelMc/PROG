public class Empresa {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    /**
     * @author Miguel Macias
     * @param args
     * @throws Exception
     *                   Aqui tenemos el Main donde vamos a realizar todas la
     *                   aplicaciones de las funciones y objetos anteriores
     */
    public static void main(String[] args) throws Exception {
        // Inicializamos nuestro Array
        Empleados[] miemple = new Empleados[3];
        // Aqui le asignamo valor a nuestros Arrays
        miemple[0] = new Tecnico("Miguel Macias ", 19, "IO0112", 1200, 5, "Seguridad");
        miemple[1] = new Gestor("Pepe Macias ", 22, "GS0111", 2000, 3, 1000);
        miemple[2] = new Administrativo("Samuel Macias ", 33, "ADS01113", 3000, 1, "Recursos Humanos");
        // Todo estos son las Funciones que usamos
        // 1º Muestra los Datos "toString"
        System.out.println(RED_BRIGHT + "Aqui mostramos los datos del usuarios " + RESET);
        for (Empleados empleados : miemple) {
            System.out.println(empleados);
        }
        // 2º Muestra lo salarios de cada uno de ellos sus bonificaciones ademas de
        // ellos sale el mensaje que pusimos antes para calcular las bonificaciones
        System.out.println(YELLOW_BRIGHT + " Aqui mostramos el Salario" + RESET);
        for (Empleados empleados : miemple) {
            ((CalculosLaborales) empleados).calcularSalario();
        }
        // 3º Muestra el numero total de dias segun los años trabajados
        System.out.println(GREEN_BRIGHT + "Aqui calculamos las vacaciones " + RESET);
        for (Empleados empleados : miemple) {
            ((CalculosLaborales) empleados).calcularVacaciones();
        }
        // 4º Aqui muestra el numero total de empleados "La variable estatica de
        // totalEmpledos"
        System.out.println("Numero Total de empleados " + YELLOW_BRIGHT + Empleados.getTotalEmpleados() + RESET);
    }

}
