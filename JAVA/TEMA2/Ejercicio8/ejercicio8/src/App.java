
public class App {
    public static void main(String[] args) throws Exception {
        float sueldoBaseJunior = (950);
        float sueldoBaseSenior = (1200);
        float sueldoBaseJefe = (1600);
        System.out.println("1 - Programador Junior");
        System.out.println("2 - Prog . Senior");
        System.out.println("3 - Jefe de Proyecto");
        int cargo = Integer.parseInt(System.console().readLine());
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?");
        int dias = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
        int estadocivil = Integer.parseInt(System.console().readLine());
        double sueldodieta = (dias * 30);
        switch (cargo) {
            case 1:
                double IRPFsoltera = (sueldoBaseJunior * 0.25);
                double IRPFcasado = (sueldoBaseJunior * 0.20);
                System.out.println("----------------------------------");
                System.out.printf("Sueldo base %22.2f \n", sueldoBaseJunior);
                System.out.printf("Dietas ( %-2d viajes) %14.2f \n", dias, sueldodieta);
                System.out.println("----------------------------------");
                System.out.printf("Sueldo bruto %21.2f \n", (sueldoBaseJunior + sueldodieta));
                if (estadocivil == 1) {
                    System.out.printf("Retención IRPF (25%%) %13.2f \n", (IRPFsoltera));
                    System.out.println("----------------------------------");
                    System.out.printf("Sueldo Neto %22.2f \n", ((sueldoBaseJunior + sueldodieta) - IRPFcasado));
                    System.out.println("----------------------------------");
                } else {
                    System.out.printf("Retención IRPF (20%%) %13.2f \n", (IRPFcasado));
                    System.out.println("----------------------------------");
                    System.out.printf("Sueldo Neto %22.2f \n", ((sueldoBaseJunior + sueldodieta) - IRPFsoltera));
                    System.out.println("----------------------------------");
                }

                break;
            case 2:
                double IRPFsolteroSenior = (sueldoBaseSenior * 0.25);
                double IRPFcasadoSenior = (sueldoBaseSenior * 0.20);
                System.out.println("----------------------------------");
                System.out.printf("Sueldo base %22.2f \n", sueldoBaseSenior);
                System.out.printf("Dietas ( %-5d viajes) %14.2f \n", dias, sueldodieta);
                System.out.println("----------------------------------");
                System.out.printf("Sueldo bruto %21.2f \n", (sueldoBaseSenior + sueldodieta));
                if (estadocivil == 1) {
                    System.out.printf("Retención IRPF (25%%) %13.2f \n", (IRPFsolteroSenior));
                    System.out.println("----------------------------------");
                    System.out.printf("Sueldo Neto %22.2f \n", (IRPFcasadoSenior - (sueldoBaseSenior + sueldodieta)));
                    System.out.println("----------------------------------");
                } else {
                    System.out.printf("Retención IRPF (20%%) %13.2f \n", IRPFcasadoSenior);
                    System.out.println("----------------------------------");
                    System.out.printf("Sueldo Neto %22.2f \n", (IRPFsolteroSenior - (sueldoBaseSenior + sueldodieta)));
                    System.out.println("----------------------------------");
                }
                break;
            case 3:
                double IRPFsolteraJefe = (sueldoBaseJefe * 0.25);
                double IRPFcasadoJefe = (sueldoBaseJefe * 0.20);
                System.out.println("----------------------------------");
                System.out.printf("Sueldo base %22.2f \n", sueldoBaseJefe);
                System.out.printf("Dietas ( %-5d viajes) %14.2f \n ", dias, sueldodieta);
                System.out.println("----------------------------------");
                System.out.printf("Sueldo bruto %21.2f \n", (sueldoBaseJefe + sueldodieta));
                if (estadocivil == 1) {
                    System.out.printf("Retención IRPF (25%%) %13.2f \n", (IRPFsolteraJefe));
                    System.out.println("----------------------------------");
                    System.out.printf("Sueldo Neto %22.2f \n", ((sueldoBaseJefe + sueldodieta) - IRPFsolteraJefe));
                    System.out.println("----------------------------------");
                } else {
                    System.out.printf("Retención IRPF (20%%) %13.2f \n", IRPFcasadoJefe);
                    System.out.println("----------------------------------");
                    System.out.printf("Sueldo Neto %22.2f \n", ((sueldoBaseJefe + sueldodieta) - IRPFcasadoJefe));
                    System.out.println("----------------------------------");
                }

                break;
            default:
                System.out.println("Has puesto el cargo mal");

        }

    }
}
