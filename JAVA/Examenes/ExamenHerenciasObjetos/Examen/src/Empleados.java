public abstract class Empleados {
    // Estas son las varibles de la clase padre
    private String nombre;
    private int edad;
    private String idEmpleado;
    private double salarioBase;
    private int anosDeTrabajo;
    private static int totalEmpleados = 0;

    // Aqui tenemos al contructor de nuestro clase Abstracta
    Empleados(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
        this.anosDeTrabajo = anosDeTrabajo;
        totalEmpleados++;
    }

    /**
     * @param anosDeTrabajo
     *                      Este setter lo podriamos usar para darle un valor
     */
    public void setAnosDeTrabajo(int anosDeTrabajo) {
        this.anosDeTrabajo = anosDeTrabajo;
    }

    /**
     * @param anosDeTrabajo
     *                      Este getter hace que podamos ver un valor
     */
    public int getAnosDeTrabajo() {
        return anosDeTrabajo;
    }

    /**
     * @param edad
     *             Este setter lo podriamos usar para darle un valor
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param edad
     *             Este getter hace que podamos ver un valor
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param idEmpleado
     *                   Este setter lo podriamos dar un valor
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @param idempleado
     *                   Este getter hace que podamos ver un valor
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado
     *                   Este setter lo podriamos dar un valor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param nombre
     *               Este getter hace que podamos ver un valor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param salarioBase
     *                    Este setter lo podriamos dar un valor
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @param salarioBase
     *                    Este getter hace que podamos ver un valor
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param Totalempleado
     *                      Este getter hace que podamos ver un valor y esta de
     *                      forma estatica como su variable
     */
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    // Aqui tenemos el String el cual en cada una de sus herencia lo modificara //
    public String toString() {

        return "Empleado : " + nombre + ", Edad:" + edad + ", ID:" + idEmpleado + ", Salario base : " + salarioBase
                + "Años de Trabajo " + anosDeTrabajo + ".";
    }
}
