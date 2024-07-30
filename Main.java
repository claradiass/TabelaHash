public class Main {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash(13);

        tabela.inserirValor("ana", 1);
        tabela.inserirValor("joao", 2);
        tabela.inserirValor("bela", 3);
        tabela.inserirValor("marcos", 3);
        tabela.inserirValor("ana", 4);
        tabela.inserirValor("joao", 5);
        tabela.inserirValor("bela", 6);
        tabela.inserirValor("marcos", 7);
        tabela.inserirValor("bela", 8);
        tabela.inserirValor("marcos",9);
        tabela.inserirValor("ana", 10);
        tabela.inserirValor("joao", 11);
        tabela.inserirValor("bela", 12);
        // tabela.inserirValor("marcos", 13);
        
        // tabela.inserirValor("maria", 5);

        tabela.pegarValor(1); 
        tabela.pegarValor(2);
        tabela.pegarValor(28);
        
        
        tabela.pegarValor(3);
        // // tabela.pegarValor(5);

        // System.out.println("----------- remoção -----------");

        // // tabela.removerValor(1);        
        // tabela.removerValor(2);
        // // tabela.pegarValor(2);
        // tabela.inserirValor("marcela", 2);
        // tabela.pegarValor(2);

        // tabela.pegarValor(1);
        // tabela.pegarValor(2);

        // tabela.removerValor(2);
        // tabela.printTable();
    }

}
