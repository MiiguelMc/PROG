public class Estudiante {
    private String nombre;
    private double notas[];
    private int CantidadNotas;

    Estudiante(String nombre) {
        this.nombre = nombre;
        CantidadNotas = 0;
        notas = new double[10];

    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    
    /** 
     * @param newnota
     */
    public void Agregarnotas(double newnota) {
        boolean comprobador = false;
        for (int i = 0; i < notas.length && comprobador != true; i++) {
            if (notas[i] == 0.00) {
                newnota = notas[i];
                CantidadNotas = CantidadNotas + 1;
            } else if (CantidadNotas == 10) {
                comprobador = true;
            }
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public int getCantidadNotas() {
        return CantidadNotas;
    }

    public double calcularPromedio(Estudiante estudiante) {
        double total = 0;

        for (int i = 0; i < CantidadNotas; i++) {
            total = notas[i] + total;

        }
        return (total / CantidadNotas);

    }

    public String toString(Estudiante estudiante) {
        return ("Nombre " + nombre + "Notas " + getNotas() + "promedio" + calcularPromedio(estudiante));
    }

}