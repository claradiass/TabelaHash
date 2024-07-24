public class LinkedList1 {
    private Aluno head;
    private Aluno tail;
    private int count;

    public LinkedList1() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public Aluno pesquisar(int matricula){
        Aluno auxAluno = head;
        for(int i = 0; i < size(); i++){
            if(auxAluno.getMatricula() == matricula){
                return auxAluno;
            }
            auxAluno = auxAluno.getNext();
        }

        return null;
    }

    public Aluno getAluno(int index){

        int aux = 0;
        Aluno auxAluno = head;
        while(aux != index){
            auxAluno = auxAluno.getNext();
            aux++;
        }
        return auxAluno;
    }

    public void add(int matricula, String nome){

        Aluno newAluno = new Aluno(matricula, nome);

        if(head == null && tail == null){
            head = newAluno;
            tail = newAluno;

        } else {
            tail.setNext(newAluno);
            tail = newAluno;
        }
        count ++;
    } 

    public int pegarIndex(int matricula){
        
        Aluno auxAluno = head;
        for(int i = 0; i < size(); i++){
            if(auxAluno.getMatricula() == matricula){
                return i;
            }
            auxAluno = auxAluno.getNext();
        }

        return -1;
    }

    public void removeIndex(int matricula){

        if(count == 0){
            System.out.println("Lista vazia");
            return;
        }

        if (pegarIndex(matricula) == count -1){
            Aluno alunoAnterior = getAluno(count - 1);
            tail = alunoAnterior;
            tail.setNext(null);
            count --;
            return;
        } else {
            Aluno alunoRemovido = pesquisar(matricula); // retorna um aluno
            int indexAluno = pegarIndex(matricula); // retorna o index do aluno pela matricula

            Aluno AlunoAnterior = getAluno(indexAluno-1);  // pegar o aluno anterior 
            AlunoAnterior.setNext(alunoRemovido.getNext()); // mudar o next do aluno anterior para o posterior do aluno removido
            count --;
        }
    }

    public int size(){
        return count ;
    }
}
