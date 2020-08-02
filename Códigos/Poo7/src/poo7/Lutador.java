package poo7;

public class Lutador implements Menu {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //private float[] atributos ;
    private float forca;
    private float agilidade;
    private float defesa;
    
    
  public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em, float fo, float ag, float def){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setPeso(pe);
        this.setAltura(al);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        //setAtributos(fo, ag, def);
        this.setForca(fo);
        this.setAgilidade(ag);
        this.setDefesa(def);
    }


    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getPeso() {
        return peso;
    }

   public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private float getAltura() {
        return this.altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Peso Leve";
        }else if(this.peso <=83.9){
            this.categoria = "Peso Médio";
        }else{
            this.categoria = "Inválido";
        }
    }

    private int getVitorias() {
        return this.vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return this.derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return this.empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

   /* private float getAtributos(int i){
        return this.atributos[i];
    }
    private void setAtributos(float forca, float agilidade, float defesa){
        this.atributos[0] = forca;
        this.atributos[1] = agilidade;
        this.atributos[2] = defesa;
    }*/

    private float getForca() {
        return forca;
    }

    private void setForca(float forca) {
        this.forca = forca;
    }

    private float getAgilidade() {
        return agilidade;
    }

    private void setAgilidade(float agilidade) {
        this.agilidade = agilidade;
    }

    private float getDefesa() {
        return defesa;
    }

    private void setDefesa(float defesa) {
        this.defesa = defesa;
    }
    

    @Override
    public void apresentarLutador() {
        System.out.println("Ladys and gentleman......");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando: " + this.getPeso() + " kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println("Força: " + this.getForca());
        System.out.println("Agilidade: " + this.getAgilidade());
        System.out.println("Defesa: " + this.getDefesa());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    @Override
    public void treinarForca(){
        this.setForca(getForca() + 1);
    }
    
    @Override
    public void treinarAgilidade(){
        this.setAgilidade(getAgilidade() + 1);
    }
    
    @Override
    public void treinarDefesa(){
        this.setDefesa(getDefesa() + 1);
    }
    
}
