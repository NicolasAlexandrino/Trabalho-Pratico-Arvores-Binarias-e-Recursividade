package Trabalho;

public class EmOrdem {

    // Percurso em ordem: esquerda → raiz → direita
    public void percorrer(Node no) {
        if (no != null) {
            percorrer(no.esquerda);           // Visita a subárvore esquerda
            System.out.print(no.valor + " "); // Visita o nó atual
            percorrer(no.direita);            // Visita a subárvore direita
        }
    }
}

