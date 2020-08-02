package expoo02;

public class ExPoo02 {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Ana Lucia", 19, " feminino"); 
        aluno1.setCurso("Medicina");
        aluno1.setPeriodo(3);
        
        
        aluno1.matricular();
      //aluno1.desmatricular();
        aluno1.setNota(9f, 5f);
        aluno1.calcMedia();
        aluno1.status();
    }
    
}
