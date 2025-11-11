package Trabalho;

public class ArvoreBinaria {

    private Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Inserção recursiva
    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node atual, int valor) {
        if (atual == null) {
            return new Node(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRec(atual.direita, valor);
        }

        return atual;
    }

    // Busca recursiva
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Node atual, int valor) {
        if (atual == null)
            return false;

        if (atual.valor == valor)
            return true;

        return valor < atual.valor
                ? buscarRec(atual.esquerda, valor)
                : buscarRec(atual.direita, valor);
    }

    // Retorna a raiz para ser usada nas classes de percurso
    public Node getRaiz() {
        return raiz;
    }
}
