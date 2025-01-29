public class Tecnico extends Empleados implements CalculosLaborales {
    private String especialidad;

    /**
     * @author Miguel Macias del Pino
     *         Aqui tenemos a nuestro constructor para los Tecnicos
     *
     */
    Tecnico(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo, String especialidad) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.especialidad = especialidad;
    }

    /**
     * Aqui Calculamos la Bonificacion gracias a su especialidad
     *
     */
    public double calcularBonificacion() {
        if (especialidad.equals("Redes")) {
            System.out.println("Tu Bonificacion es de 1000$");
            return 1000;
        } else if (especialidad.equals("Seguridad")) {
            System.out.println("Tu Bonificacion es de 1200$");
            return 1200;

        } else
            System.out.println("Tu Bonificaion es de 800$");
        return 800;
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
        System.out.println(getNombre() + "Tus Vacaciones son de " + getAnosDeTrabajo() * 20 + " Dias.");
        return getAnosDeTrabajo() * 20;
    }

    /**
     * 
     * Aqui gracias al @override Sobrepasamos a el metodo de la clase Abstracta
     */
    @Override
    public String toString() {

        return "Técnico: " + getNombre() + ", Edad: " + getEdad() + ", ID:  " + getIdEmpleado() + ", Salario Base: "
                + getSalarioBase() + ", Años de trabajo : " + getAnosDeTrabajo() + ", Especialidad: " + especialidad;
    }
}
