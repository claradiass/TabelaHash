import java.lang.reflect.Array;

public class TabelaHash {
    LinkedList1[] listaDaPosicao;
    int size;

    public TabelaHash() {
        this.size = 20;
        listaDaPosicao = new LinkedList1[size];
        for(int i = 0; i < size; i++ ){
            listaDaPosicao[i] = new LinkedList1();
        }
    }

    public int hash(int matricula){
        return matricula % 20; // tem que pensar em funções hash que vão se adaptar a cada caracteristicas que vá se daptar a cada key (chave)
    }

    public void pegarValor(int matricula){
        int index = hash(matricula);
        if(listaDaPosicao[index].pesquisar(matricula) == null){
            System.out.println("Matrícula inexistente");
        } else {
            System.out.println(listaDaPosicao[index].pesquisar(matricula));
        }
        
    }

    public void inserirValor(String nome, int matricula){
        int index = hash(matricula);
        listaDaPosicao[index].add(matricula, nome);;
        
    }

    public void removerValor(int matricula){
        int index = hash(matricula);
        if(listaDaPosicao[index].pesquisar(matricula) == null){
            System.out.println("Matrícula inexistente ou já removida");
            return;
        } 
            listaDaPosicao[index].removeIndex(matricula);
        
        
        
    }

    
}