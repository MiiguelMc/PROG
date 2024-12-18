public class pizza {
    String Tamaño; 
    String Tipo;
    String Estado = "Pedida" ;
    pizza (String Tamaño, String Tipo ){
        this.Tamaño = Tamaño;
        this.Tipo = Tipo;
    }
    public String goString(){
        return "Su pizza es una "+Tipo+" y su tamaño es "+Tamaño+" Y su estado actual es "+Estado;
    }
        public void sirve(){
        this.Estado = "Servida";
    }

    
}
