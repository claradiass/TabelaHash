public class Aluno {
    private int matricula;
    private String nome;
    private Aluno next;

    
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.next = null;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getNext() {
        return next;
    }
    public void setNext(Aluno next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nome: " + nome.toString();
    }
}
