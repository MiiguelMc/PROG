public class Administrativo extends Empleados implements CalculosLaborales {
    private String area;

    /**
     * @author Miguel Macias del Pino
     *         Aqui tenemos a nuestro constructor para los Administrativo
     *
     */
    Administrativo(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo, String area) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.area = area;
    }

    /**
     * Aqui Calculamos la Bonificacion gracias a su Area
     *
     */
    public double calcularBonificacion() {
        if (area.equals("Recursos humanos")) {
            System.out.println("Tu bonificacion es de " + 30 * 20 + "$");
            return 30 * 20;
        } else {
            System.out.println("Tu bonificacion es de " + 30 * 10 + "$");
            return 30 * 10;
        }

    }

    /**
     * Aqui calculasmos el Salario total juntando el base mas las bonificaciones
     *
     */
    public double calcularSalario() {
        System.out.println(
                "Tu salario total contando bonificaciones es de " + (getSalarioBase() + calcularBonificacion()) + "$");
        return getSalarioBase() + calcularBonificacion();
    }

    /**
     * Aqui calculamos la Vacaciones Basandonos en los años de trabajo
     *
     */
    public int calcularVacaciones() {
        System.out.println(getNombre() + "Tus Vacaciones son de " + getAnosDeTrabajo() * 15 + " Dias.");
        return getAnosDeTrabajo() * 15;
    }

    /**
     * 
     * Aqui gracias al @override Sobrepasamos a el metodo de la clase Abstracta
     */
    @Override
    public String toString() {

        return "Gestor: " + getNombre() + ", Edad: " + getEdad() + ", ID:  " + getIdEmpleado() + ", Salario Base: "
                + getSalarioBase() + ", Años de trabajo : " + getAnosDeTrabajo() + ", Area: " + area;
    }
}
