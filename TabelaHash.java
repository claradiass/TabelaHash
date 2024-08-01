import java.lang.reflect.Array;

public class TabelaHash {
    Aluno[] lista;
    private int tamanho;
    public int getTamanho() {
        return tamanho;
    }

    private int quantidade;

    // private static final Aluno DELETED = new Aluno(-1, "deleted");

    public TabelaHash(int tamanhoInicial) {
        this.lista = new Aluno[tamanhoInicial];
        this.tamanho = tamanhoInicial;
        this.quantidade = 0;
    }

    public int hash(int matricula){
        return matricula % tamanho; // tem que pensar em funções hash que vão se adaptar a cada caracteristicas que vá se daptar a cada key (chave)
    }

    public void pegarValor(int matricula){
        int hash = hash(matricula);
        for (int i = 0; i < lista.length; i++) {
            if (lista[hash] == null) {
                break; // Se encontrar uma posição vazia, pare a busca
            }
            if (!lista[hash].getNome().equals("DELETED") && lista[hash].getMatricula() == matricula) {
                System.out.println(lista[hash].getNome());
                return; // Encerra o método após encontrar o aluno
            }
        }
        System.out.println("Nenhum aluno com essa matrícula");        
    }

    private void redimensionar() {
        Aluno[] tabelaAntiga = lista;
        int tamanhoAntigo = tamanho;
    
        // Dobrar o tamanho da lista
        tamanho = tamanho * 2;
        lista = new Aluno[tamanho];
        quantidade = 0;
    
        System.out.println("Redimensionando tabela de tamanho " + tamanhoAntigo + " para " + tamanho);
    
        // Re-hash dos elementos antigos
        for (int i = 0; i < tamanhoAntigo; i++) {
            if (tabelaAntiga[i] != null) {
                // Chamada corrigida: primeiro a matrícula, depois o nome
                inserirValor(tabelaAntiga[i].getMatricula(), tabelaAntiga[i].getNome());
            }
        }
    }

    public void inserirValor(int matricula, String nome){

        if (quantidade >= tamanho) {
            redimensionar();
        }

        int posicao = hash(matricula);
        while (lista[posicao] != null && lista[posicao].getNome().equals("DELETED")) {
            posicao = (posicao + 1) % tamanho;
        }
        lista[posicao] = new Aluno(matricula, nome);
        quantidade++;        
    }

    public void removerValor(int matricula){
        int index = hash(matricula);
        // for (TipoElemento elemento : colecao) {
        //     // bloco de código que usa o elemento
        // }
        
        for(Aluno aluno : lista){
            if(aluno != null && aluno.getMatricula() == matricula){
                
                lista[index] = new Aluno(matricula, "DELETED");
                
            }
            
        }
    }

    public void printTable() {
        for (int i = 0; i < tamanho; i++) {
            if (lista[i] == null) {
                System.out.println("Bucket " + i + ": null"); // Posição vazia
            } else if (lista[i].getNome().equals("DELETED") ) {
                System.out.println("Bucket " + i + ": DELETED"); // Posição removida
            } else {
                System.out.println("Bucket " + i + ": " + lista[i]); // Posição ocupada por um aluno
            }
        }
    }

    
}




