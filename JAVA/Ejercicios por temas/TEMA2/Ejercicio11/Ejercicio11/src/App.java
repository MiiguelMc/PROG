public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¿Buenas que hora es (24h) ?");
        Integer hora = Integer.parseInt(System.console().readLine());
        if (hora>=6 && hora<=12){
            System.out.println("Buenos Días");
        }else if(hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        }else if(hora>=21 && hora<=5){
            System.out.println("Buenos Noches");
    }
}
}
