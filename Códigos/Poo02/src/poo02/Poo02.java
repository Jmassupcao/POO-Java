package poo02;

public class Poo02 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "Compact";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80; 
        c1.tampada = true;
        
        c1.status();
        
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "preta";
        c2.destampar();
        c2.rabiscar();
        
        
        
    }
    
}
