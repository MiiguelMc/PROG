public class PruebaCaballo {
    public static void main(String[] args) {
        int edad = Caballo.pidenter();
        String raza = System.console().readLine();
        Caballo galope = new Caballo("Galope", raza, "Marron", edad);
        raza = System.console().readLine();
        galope.setraza(raza);
        galope.tostring();
        // Caballo caballin = new Caballo("Caballito","Arabe","Blanco",edad);
        // caballin.tostring();
        System.out.println(galope.getraza());
        // System.out.println("A partir de ahora vamos a usar set y get");
        System.out.println("Aqui nos da la raza del primer animal " + galope.getraza());

    }

}