public class Socio {
    private int IDsocio;
    private String nombre;
    private int edad;
    private String localidad;
    private int estatura;

    public Socio(int id, String nombre,int estatura, int edad, String localidad) {
        this.IDsocio = id;
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
        this.localidad = localidad;
    }

    public Socio(Socio misocio) {
        this.IDsocio = misocio.IDsocio;
        this.nombre = misocio.nombre;
        this.estatura = misocio.estatura;
        this.edad = misocio.edad;
        this.localidad = misocio.localidad;

    }

    public int getIDSocio() {
        return IDsocio;
    }

    public int getEstatura() {
        return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Socio [socio=" + IDsocio + ", nombre=" + nombre + ", edad=" + edad + ", localidad=" + localidad + "]";
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

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

}
