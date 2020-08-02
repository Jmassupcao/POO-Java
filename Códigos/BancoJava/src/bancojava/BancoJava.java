package bancojava;

public class BancoJava {

    public static void main(String[] args) {
       ContaBanco c1 = new ContaBanco();
       
       c1.abrirConta("cc", "Joao", 9654);
       c1.sacar(10f, 9654);
       c1.pagarMensal();
       c1.sacar(28f, 9654);
       System.out.println(c1.getSaldo());
       c1.fecharConta(9654);
       c1.status();
       
    }
    
}
