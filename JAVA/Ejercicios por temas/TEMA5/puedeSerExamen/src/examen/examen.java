package examen;

import bucles.bucle;
import matematica.operaciones.resta;
import matematica.operaciones.suma;
import randoms.numeroaleatorios;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Menu de Funciones Con Numeros Randoms");
        System.out.println("1-Suma ");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.print("4-bucle de aleatorio 1 a aleatorio 2  ");
        int eleccion = Integer.parseInt(System.console().readLine());
        int random1 = (numeroaleatorios.aleatorio());
        int random2 = (numeroaleatorios.aleatorio());
        switch (eleccion) {
            case 1:
                System.out.println(suma.sumadenumeros(random1, random2));
                break;
            case 2:
                System.out.println(resta.esresta(random1, random2));
                break;
            case 4:
                System.out.println(bucle.detalacual(random1, random2));
                break;
            default:
                break;
        }
    }

}
