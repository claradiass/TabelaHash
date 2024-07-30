import java.lang.reflect.Array;

public class TabelaHash {
    Aluno[] lista;
    private int tamanho;
    private int quantidade;

    private static final Aluno DELETED = new Aluno(-1, "deleted");

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
            if (lista[hash] != DELETED && lista[hash].getMatricula() == matricula) {
                System.out.println(lista[hash].getNome());
                return; // Encerra o método após encontrar o aluno
            }
        }
    
        System.out.println("Nenhum aluno com essa matrícula");

        // while (lista[hash] != null) {
        //     if (lista[hash] != DELETED && lista[hash].getMatricula() == matricula) {
        //         System.out.println(lista[hash].getNome());
        //         return;
        //     }
        //     hash = (hash + 1) % lista.length;
        // }
        // System.out.println("Nenhum aluno com essa matrícula");


        // for(Aluno aluno : lista){
        //     if(aluno != null){
        //         if(aluno.getMatricula() == matricula){
        //             System.out.println(aluno);
        //         }
        //     }
            
        // }
        
    }

    public void inserirValor(String nome, int matricula){
        int index = hash(matricula);
        int startIndex = index;

        while (lista[index] != null) {
            index = (index + 1) % tamanho; // Move para a próxima posição
            if (index == startIndex) {  // Se voltar ao início, a lista está cheia
                tamanho += tamanho;
            }
        }

        lista[index] = new Aluno(matricula, nome); // Insere o novo aluno na posição encontrada
    

        // if(lista[index] != null && lista[index] != DELETED){



        //     for(int i = index; i < size(); i++){
        //         if(lista[i] == null){
        //             lista[i] = new Aluno(matricula, nome);
        //             return;
        //         }
        //     }// esse for está errado
        //     // caso tenha cabado o tamanho e não encaixado em nenhuma
        // } else {
        //     lista[index] = new Aluno(matricula, nome);
        // }        
    }

    public void removerValor(int matricula){
        int index = hash(matricula);
        // for (TipoElemento elemento : colecao) {
        //     // bloco de código que usa o elemento
        // }
        
        for(Aluno aluno : lista){
            if(aluno != null){
                if(aluno.getMatricula() == matricula){
                    lista[index] = DELETED;
                }
            }
            
        }
    }

    public void printTable() {
        for (int i = 0; i < tamanho; i++) {
            if (lista[i] == null) {
                System.out.println("Bucket " + i + ": null"); // Posição vazia
            } else if (lista[i] == DELETED) {
                System.out.println("Bucket " + i + ": DELETED"); // Posição removida
            } else {
                System.out.println("Bucket " + i + ": " + lista[i]); // Posição ocupada por um aluno
            }
        }
    }

    
}