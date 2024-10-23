 public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Di un numero del 1 al 3!");
        int num = Integer.parseInt(System.console().readLine());
        int rat = (int) (Math.random()*3);
        System.out.println(rat);
        if(rat == num){
            System.out.println("Has acertado ");
        }
        else {
            System.out.println("No has acertado");
        }

        }
        
    }