package Trabalho;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserindo elementos
        arvore.inserir(8);
        arvore.inserir(3);
        arvore.inserir(10);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(14);
        arvore.inserir(4);
        arvore.inserir(7);
        arvore.inserir(13);

        System.out.println("===== TESTE DE PERCURSOS =====");

        System.out.print("Pré-Ordem: ");
        PreOrdem pre = new PreOrdem();
        pre.percorrer(arvore.getRaiz());
        System.out.println();

        System.out.print("Em-Ordem: ");
        EmOrdem em = new EmOrdem();
        em.percorrer(arvore.getRaiz());
        System.out.println();

        System.out.print("Pós-Ordem: ");
        PosOrdem pos = new PosOrdem();
        pos.percorrer(arvore.getRaiz());
        System.out.println();

        // Teste de busca
        System.out.println("\n===== TESTE DE BUSCA =====");
        System.out.println("Buscar 7: " + arvore.buscar(7));
        System.out.println("Buscar 8: " + arvore.buscar(8));
        System.out.println("Buscar 15: " + arvore.buscar(15));
    }
}
