package poo02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("carga: " + this.carga +"%");
        System.out.println("está tampada? " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO: destampe sua caneta!");
        }else{
            System.out.println("caneta " + this.modelo +" rabiscando...");
            System.out.println("xxooxxooxxoox");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
}
