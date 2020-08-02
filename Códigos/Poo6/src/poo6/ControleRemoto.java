package poo6;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private int hist;
    private boolean menu;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume(){
        return this.volume;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setVolume(int V){
        this.volume = V;
    }
    private void setLigado(boolean L){
        this.ligado = L;
    }
    private void setTocando(boolean T){
        this.tocando = T; 
    }
    //métodos abstratos:
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado() && !(this.menu)){
        System.out.println("-----Menu Aberto-----");
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for(int i=1; i<= this.getVolume(); i+=4){
            System.out.print("|");
        }
        this.menu = true;
        }else{
            System.out.println("Não foi possível ligar o menu");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado() && this.menu){
        System.out.println("");
        System.out.println("Fechando menu...");
        this.menu = false;
        }else{
            System.out.println("Não foi possível abrir o menu");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
        System.out.println("Não foi possível aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Não foi possível diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.hist = this.getVolume();
            this.setVolume(0);
        }else{
            System.out.println("Não foi possível ligar o mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(hist);
        }else{
            System.out.println("Não foi possível desligar o mudo");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não foi possível dar play");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("não foi possivel pausar");
        }
        
    }
    
}
