package expoo02;

public class Aluno {
    
    private String nome;
    private int idade;
    private String genero;
    private String curso;
    private boolean matriculado;
    private int matricula;
    private int periodo;
    private Float nota[] = new Float[2];
    private Float media;
    private  boolean aprovado;
    
    private boolean check;
   
    void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + this.genero);
        System.out.println("Curso: " + this.curso);
        System.out.println("matriculado: " + this.matriculado);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Periodo: " + this.periodo);
        for (int i=0; i<2; i++){
            System.out.println("Nota" + i + ": " + nota[i]);
        }
        System.out.println("Media: " + this.media);
        System.out.println("Aprovado: " + this.aprovado);
    }

    public Aluno(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Float[] getNota() {
        return nota;
    }

    public void setNota(float nota1, float nota2) {
        this.nota[0] = nota1;
        this.nota[1] = nota2;
        check = true;
    }

    public Float getMedia() {
        return media;
    }

    public void setMedia(Float media) {
        this.media = media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    void matricular(){
        this.matriculado = true;
        this.matricula = (int) (Math.random() * 10000);
        System.out.println("Aluno matriculado com sucesso!");
    }
    void desmatricular (){
        this.matriculado = false;
        this.matricula = 0;
        System.out.println("Aluno desmatriculado com sucesso!");
    }
    void calcMedia(){
        if(this.matriculado && check){
            this.media = (nota[0] + nota[1])/2;
            this.aprovado = (this.media >= 7.0f);
        }else if(this.matriculado == false){
            System.out.println("Aluno nao matriculado: nao é possivel"
                               + " calcular a media!");
        }else{
            System.out.println("Nota do aluno não atualizada!");
        }
    }
    /*void atulizarSituação(){
        if(this.matriculado){
            aprovado = (media < 7.0f)?false:true;
        }else{
            System.out.println("Aluno nao matriculado: nao e possivel"
                               + " atualizar a situacao do aluno!" );
        }
    }*/ 
    void atualizarNotas(float n1, float n2){
        if(this.matriculado){
            nota[0] = n1;
            nota[1] = n2;
            check = true;
        }else{
            System.out.println("Aluno nao matriculado: nao e possivel"
                               + " atualizar a nota!");
        }
    }
    
}
