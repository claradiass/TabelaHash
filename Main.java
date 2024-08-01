public class Main {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash(13);

        tabela.inserirValor(1, "ana");
tabela.inserirValor(2, "joao");
tabela.inserirValor(3, "bela");
tabela.inserirValor(3, "marcos");
tabela.inserirValor(4, "bia");
tabela.inserirValor(5, "lino");
tabela.inserirValor(6, "harry");
tabela.inserirValor(7, "rony");
tabela.inserirValor(8, "draco");
tabela.inserirValor(9, "fatinha");
tabela.removerValor(7);
tabela.inserirValor(10, "joana");
tabela.inserirValor(11, "gu");
System.out.println(tabela.getTamanho());
tabela.inserirValor(12, "caio");

        tabela.inserirValor(12, "julia");
        tabela.inserirValor(1, "ana");
tabela.inserirValor(2, "joao");
tabela.inserirValor(3, "bela");
tabela.inserirValor(3, "marcos");
tabela.inserirValor(4, "bia");
tabela.inserirValor(5, "lino");
tabela.inserirValor(6, "harry");
tabela.inserirValor(7, "rony");
tabela.inserirValor(8, "draco");
tabela.inserirValor(9, "fatinha");
tabela.removerValor(7);
tabela.inserirValor(10, "joana");
tabela.inserirValor(11, "gu");
tabela.inserirValor(12, "caio");

        tabela.inserirValor(52, "julia");

        

        // tabela.pegarValor(1); 
        // tabela.pegarValor(2);
        // tabela.pegarValor(28);
        
        
        // tabela.pegarValor(3);
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
        tabela.printTable();
    }

}



