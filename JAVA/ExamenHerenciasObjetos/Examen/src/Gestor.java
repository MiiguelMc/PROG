public class Gestor extends Empleados implements CalculosLaborales {
    private double presupuesto;

    /**
     * @author Miguel Macias del Pino
     *         Aqui tenemos a nuestro constructor para los Gestor
     *
     */
    Gestor(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo, double presupuesto) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.presupuesto = presupuesto;
    }

    /**
     * Aqui Calculamos la Bonificacion gracias a presupuesto
     *
     */
    public double calcularBonificacion() {
        System.out.println("Tu bonificacion es de " + ((presupuesto * 5) / 100) + "$");
        return (presupuesto * 5) / 100;
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
        System.out.println(getNombre() + "Tus Vacaciones son de " + getAnosDeTrabajo() * 30 + " Dias.");
        return getAnosDeTrabajo() * 30;
    }

    /**
     * 
     * Aqui gracias al @override Sobrepasamos a el metodo de la clase Abstracta
     */
    @Override
    public String toString() {

        return "Gestor: " + getNombre() + ", Edad: " + getEdad() + ", ID:  " + getIdEmpleado() + ", Salario Base: "
                + getSalarioBase() + ", Años de trabajo : " + getAnosDeTrabajo() + ", Presupuesto: " + presupuesto;
    }
}
