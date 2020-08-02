package bancojava;

public class ContaBanco {
    
    protected String tipo;
    public int numConta;
    private String dono;
    private float saldo;
    private int senha;
    private boolean status;
    
    private boolean check1;
    
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if("cc".equals(tipo) || "cp".equals(tipo)){
            this.tipo = tipo;
           check1 = true;
        }else{
             System.out.println("Tipo de conta invalodo!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo, String nome, int senha){
        this.setTipo(tipo);
        if(check1){
            this.setDono(nome);
            this.setSenha(senha);
            this.setNumConta((int) (Math.random() * 100000));
             if("cc".equals(this.tipo)){
                 setSaldo(50);
             }else{
                 setSaldo(150);
             }   
             setStatus(true);
             System.out.println("Conta aberta com sucesso!");
          }
   }
        
        public void fecharConta(int senha){
            if(senha == this.senha){
                if(this.saldo != 0){
                    System.out.println("A conta não foi aberta, senha invalida ou saldo não zerado!");
                 }else{
                    setStatus(false);
                    System.out.println("Conta fechada com sucesso!");
                }
            }
       }
          
        public void sacar(float saque, int senha){
            if(senha == this.senha){
                if(saque > 0f && saque <= this.saldo){
                    this.saldo -= saque;
                    //System.out.println("entrou!!");
                 }else{
                    System.out.println("A conta não foi aberta, senha invalida ou saldo insuficiente!");
                }            
            }

        } 
        
        public void depositar(float deposito, int senha){
            if(senha == this.senha){ 
                if(check1){
                    this.saldo += deposito;
                }else{
                    System.out.println("A conta não foi aberta ou senha invalida!");
                 }
            }
        }
        
        public void pagarMensal(){
            if("cc".equals(this.tipo)){
                this.saldo -= 12f;
            }else if("cp".equals(this.tipo)){
                this.saldo -= 20f;
            }else{
                System.out.println("A conta não foi aberta ou tipo invalido!");
            }
        }
        
        public void mudarSenha(int senha, int novaS){
            if(senha == this.senha){
                this.senha = novaS;
            }
        }
        
        public void status(){
            System.out.println("tipo: " + this.getTipo());
            System.out.println("dono: " + this.getDono());
            System.out.println("saldo: " + this.getSaldo());
        }
    
    
}
