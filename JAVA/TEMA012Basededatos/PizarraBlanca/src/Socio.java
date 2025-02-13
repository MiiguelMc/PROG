public class Socio {
    private int socio;
    private String nombre;
    private int edad;
    private String localidad;

    public Socio(int socio, String nombre, int edad, String localidad) {
        this.socio = socio;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public Socio(Socio misocio) {
        this.socio = misocio.socio;
        this.nombre = misocio.nombre;
        this.edad = misocio.edad;
        this.localidad = misocio.localidad;
    }

    public int getSocio() {
        return socio;
    }

    public void setSocio(int socio) {
        this.socio = socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Socio [socio=" + socio + ", nombre=" + nombre + ", edad=" + edad + ", localidad=" + localidad + "]";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

}
