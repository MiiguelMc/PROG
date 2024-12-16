
public class Caballo {
    String nombre;
    String raza;
    String color;
    int edad;

    Caballo(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public void tostring() {
        System.out.println("El nombre del Caballo es " + nombre);
        System.out.println("Es de Pura raza " + raza);
        System.out.println("Su impresionante color es " + color);
        System.out.println("El animalito tiene " + edad + " años de edad");

    }
//Aqui tenemos el metodo para las excepciones 
    public static int pidenter() {
        boolean maledad = true;
        int Mienter = 0;
        while (maledad) {
            try {
                Mienter = Integer.parseInt(System.console().readLine());
                maledad = false;
            } catch (Exception e) {
                System.out.println("Has indicado un caracter incorrecto");
            }
        }
        return Mienter;
    }
// Aqui tenemos para que nos devuelva el valor de razas es importante si raza es privado
    public String getraza() {
        return this.raza;
    }
    public void setraza(String raza){
        this.raza = raza ;
    }
}
