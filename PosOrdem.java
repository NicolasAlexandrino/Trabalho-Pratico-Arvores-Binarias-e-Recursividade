package Trabalho;

public class PosOrdem {

    // Percurso em pós-ordem: esquerda → direita → raiz
    public void percorrer(Node no) {
        if (no != null) {
            percorrer(no.esquerda);           // Visita a subárvore esquerda
            percorrer(no.direita);            // Visita a subárvore direita
            System.out.print(no.valor + " "); // Visita o nó atual
        }
    }
}

