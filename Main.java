public class Main {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash();

        tabela.inserirValor("ana", 1);
        tabela.inserirValor("joao", 2);
        tabela.inserirValor("marcos", 3);
        tabela.inserirValor("marcela", 4);
        tabela.inserirValor("maria", 5);

        tabela.pegarValor(1);
        tabela.pegarValor(2);
        tabela.pegarValor(3);
        tabela.pegarValor(4);
        tabela.pegarValor(5);

        System.out.println("----------- remoção -----------");

        tabela.removerValor(1);        
        tabela.removerValor(2);

        tabela.pegarValor(1);
        tabela.pegarValor(2);

        tabela.removerValor(2);
    }

}
