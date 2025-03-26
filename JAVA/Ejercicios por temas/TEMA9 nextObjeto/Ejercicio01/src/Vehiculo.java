public abstract class Vehiculo {
    String marca;
    static int kilometrostotal = 0;
    String matricula;
    String daños;

    public static void setKilometrostotal(int kilometrostotal) {
        Vehiculo.kilometrostotal = kilometrostotal;

    }

    public String toString() {

        return marca + " " + matricula + " " + daños;
    }

}