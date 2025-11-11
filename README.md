# Trabalho-Pratico-Arvores-Binarias-e-Recursividade

# 🌳 Trabalho Prático – Árvores Binárias e Recursividade

### Disciplina: Estrutura de Dados

**Professor:** Prof. Anderson Soares
**Aluno:** *Nicolas Alecandrino*
**IDE utilizada:** Eclipse
---

## 🎯 Objetivo

Compreender o conceito de **recursividade** e aplicá-lo na implementação de uma **árvore binária de busca (BST)**, incluindo as operações de **inserção**, **busca** e **percursos**:

* **Pré-Ordem**
* **Em Ordem**
* **Pós-Ordem**

---

## 🧠 Parte 1 – Conceitos e Explicações

### 1️⃣ O que é recursividade?

Recursividade é uma técnica onde uma função chama a si mesma para resolver partes menores de um problema até atingir uma **condição de parada**, chamada de **caso base**.
Essa abordagem é muito usada em estruturas de dados como **árvores**, porque cada nó pode ser tratado como uma subárvore independente.

Um exemplo clássico é o cálculo de fatorial, onde `fatorial(n)` chama `fatorial(n-1)` até que `n` seja 0.

---

### 2️⃣ Como a recursividade é usada na travessia de uma árvore binária?

A recursividade é ideal para percorrer uma árvore binária porque a estrutura da árvore é **naturalmente recursiva**:
cada nó possui **subárvores** à esquerda e à direita que seguem o mesmo formato da árvore principal.

Assim, uma função recursiva pode percorrer toda a árvore sem precisar de laços de repetição.
Cada chamada trata um nó e repassa o mesmo processo para seus filhos.

---

### 3️⃣ Qual a diferença entre recursão e laço (for/while)?

| Aspecto   | Recursão                                          | Laço (for/while)                               |
| --------- | ------------------------------------------------- | ---------------------------------------------- |
| Estrutura | Chamada da função dentro dela mesma               | Repetição controlada por variável              |
| Controle  | Depende de uma **condição de parada** (caso base) | Depende de **condições lógicas ou contadores** |
| Memória   | Usa a **pilha de chamadas** do sistema            | Usa variáveis locais e contador                |
| Uso ideal | Estruturas hierárquicas (árvores, grafos)         | Repetições lineares (vetores, listas)          |

---

## 🌲 Parte 2 – Implementação da Árvore Binária

O projeto foi implementado em **Java** no **Eclipse**, utilizando seis classes principais:

* **Node.java:** representa cada nó da árvore.
* **ArvoreBinaria.java:** contém os métodos de **inserção** e **busca**, ambos feitos de forma recursiva.
* **PreOrdem.java:** realiza o percurso **pré-ordem**.
* **EmOrdem.java:** realiza o percurso **em ordem**.
* **PosOrdem.java:** realiza o percurso **pós-ordem**.
* **Main.java:** executa os testes de inserção, busca e percursos.

---

## 🔁 Explicações dos Percursos da Árvore

A seguir, uma explicação detalhada sobre o funcionamento de cada tipo de percurso recursivo:

---

### 🌿 **1. Percurso em Pré-Ordem (Raiz → Esquerda → Direita)**

* Primeiro, o **nó atual (raiz)** é visitado.
* Depois, o método recursivo é chamado para **percorrer a subárvore esquerda**.
* Por fim, o método é chamado para **percorrer a subárvore direita**.

**Exemplo de ordem de visita:**
Raiz → Filho Esquerdo → Filho Direito

**Aplicação prática:**
Usado quando se deseja **copiar ou salvar** toda a estrutura da árvore, pois cada nó é processado antes de seus filhos.

---

### 🍃 **2. Percurso em Ordem (Esquerda → Raiz → Direita)**

* Primeiro, percorre-se **recursivamente a subárvore esquerda**.
* Depois, o **nó atual** é visitado.
* Finalmente, percorre-se a **subárvore direita**.

**Exemplo de ordem de visita:**
Filho Esquerdo → Raiz → Filho Direito

**Aplicação prática:**
É o percurso mais usado em **árvores binárias de busca (BST)**, pois resulta em uma **lista ordenada** dos valores armazenados.

---

### 🌾 **3. Percurso em Pós-Ordem (Esquerda → Direita → Raiz)**

* Primeiro, percorre-se **recursivamente a subárvore esquerda**.
* Depois, percorre-se a **subárvore direita**.
* Por último, o **nó atual** é visitado.

**Exemplo de ordem de visita:**
Filho Esquerdo → Filho Direito → Raiz

**Aplicação prática:**
Muito usado quando se deseja **remover todos os nós da árvore** (por exemplo, liberar memória), pois visita os filhos antes de remover o nó pai.

---

## 🧪 Testes realizados

No método principal (`Main.java`), foram inseridos os seguintes valores na árvore:

```
8, 3, 10, 1, 6, 14, 4, 7, 13
```

Os percursos produziram o seguinte resultado no console:

```
===== TESTE DE PERCURSOS =====
Pré-Ordem: 8 3 1 6 4 7 10 14 13 
Em-Ordem: 1 3 4 6 7 8 10 13 14 
Pós-Ordem: 1 4 7 6 3 13 14 10 8 

===== TESTE DE BUSCA =====
Buscar 7: true
Buscar 2: false
```

---

## 🔍 Casos base e chamadas recursivas

* **Caso base:** ocorre quando o nó atual é `null`, ou seja, chegou ao fim de um ramo da árvore.
* **Chamada recursiva:** é feita para os filhos esquerdo e direito de cada nó, permitindo percorrer toda a estrutura naturalmente.
* Nenhum método usa `for` ou `while`, apenas chamadas recursivas.

---

## 🏁 Conclusão

A recursividade simplifica a manipulação de árvores binárias, permitindo percorrer, buscar e inserir valores sem o uso de laços.
Cada tipo de percurso (pré, em e pós-ordem) tem uma finalidade específica e ajuda a compreender como a árvore é estruturada e processada.

O projeto demonstra como **funções recursivas** podem ser usadas de forma elegante para resolver problemas em **estruturas hierárquicas**, como as **árvores binárias de busca**.

