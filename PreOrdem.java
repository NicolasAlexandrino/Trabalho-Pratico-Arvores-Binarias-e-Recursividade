package Trabalho;

public class PreOrdem {

    // Percurso em pré-ordem: raiz → esquerda → direita
    public void percorrer(Node no) {
        if (no != null) {
            System.out.print(no.valor + " "); // Visita o nó atual
            percorrer(no.esquerda);           // Chamada recursiva para a subárvore esquerda
            percorrer(no.direita);            // Chamada recursiva para a subárvore direita
        }
    }
}
