public class App {
    public static void main(String[] args) throws Exception {
int probabilidad =0;
        int media = 0;
        int media2 =0;
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estacion del Año(1-4) ");
        System.out.print("");
        int estacion = Integer.parseInt(System.console().readLine());
        switch (estacion) {
            case 1:
                media = (int) (Math.random()*(30-15+1)+15);
                media2 = (int) (Math.random()*(30-15+1)+15);
                if(media>media2){
                    System.out.println("Temperatura Maxima "+ media);
                    System.out.println("Temperatura Minima "+ media2);
                }else{
                    System.out.println("Temperatura Maxima "+ media2);
                    System.out.println("Temperatura Minima "+ media);
                }
                probabilidad = (int)(Math.random()*10);
                if(probabilidad<=6){
                    System.out.println("Va a estar Soleado");
                }else{
                    System.out.println("Va a llover");
                }
                break;
            case 2:
            media = (int) (Math.random()*(45-25+1)+25);
            media2 = (int) (Math.random()*(45-25+1)+25);
            if(media>media2){
                System.out.println("Temperatura Maxima "+ media);
                System.out.println("Temperatura Minima "+ media2);
            }else{
                System.out.println("Temperatura Maxima "+ media2);
                System.out.println("Temperatura Minima "+ media);
            }
            probabilidad = (int)(Math.random()*10);
            if(probabilidad<=8){
                System.out.println("Va a estar Soleado");
            }else{
                System.out.println("Va a llover");
            }
                break;
            case 3:
                media = (int) (Math.random()*(20-30+1)+20);
                media2 = (int) (Math.random()*(20-30+1)+20);
                if(media>media2){
                    System.out.println("Temperatura Maxima "+ media);
                    System.out.println("Temperatura Minima "+ media2);
                }else{
                    System.out.println("Temperatura Maxima "+ media2);
                    System.out.println("Temperatura Minima "+ media);
                }
                probabilidad = (int)(Math.random()*10);
                if(probabilidad<=4){
                    System.out.println("Va a estar Soleado");
                }else{
                    System.out.println("Va a llover");
                }
                    break;
            case 4:
            media = (int) (Math.random()*(25-0+1)+0);
            media2 = (int) (Math.random()*(25-0+1)+0);
            if(media>media2){
                System.out.println("Temperatura Maxima "+ media);
                System.out.println("Temperatura Minima "+ media2);
            }else{
                System.out.println("Temperatura Maxima "+ media2);
                System.out.println("Temperatura Minima "+ media);
            }
            probabilidad = (int)(Math.random()*10);
            if(probabilidad<=2){
                System.out.println("Va a estar Soleado");
            }else{
                System.out.println("Va a llover");
            }
                break;
            default:
                break;
        }




    }
}
