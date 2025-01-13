public class TestGato {
    public static void main(String[] args) throws Exception {
        gato[] animalito = new gato[2];
        System.out.println("Indicanos la informacion de tu gato");
        String nombre;
        String raza;
        int peso;
        int edad;
        for (int i = 0; i < animalito.length; i++) {
            animalito[i] = new gato();
            System.out.println("Gato numero "+ (i +1) );
            System.out.print("Nombre: ");
            nombre = System.console().readLine();
            (animalito[i]).setNombre(nombre);
            System.out.print("Raza: ");
            raza = System.console().readLine();
            (animalito[i]).setRaza(raza);
            System.out.print("Peso: ");
            peso = Integer.parseInt(System.console().readLine());
            (animalito[i]).setPeso(peso);
            System.out.print("Edad: ");
            edad = Integer.parseInt(System.console().readLine());
            (animalito[i]).setEdad(edad);
            
        }
        for (int i = 0; i < animalito.length; i++) {
            System.out.println("El nombre del gato es " + animalito[i].getNombre()+" Su raza es "+animalito[i].getRaza() + " Su Peso es "+ animalito[i].getPeso() +" Su edad es "+ animalito[i].getEdad());
        }
    }
}
