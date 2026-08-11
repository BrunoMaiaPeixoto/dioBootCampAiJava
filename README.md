# 📚 Anotações Simplificadas: Arrays vs. ArrayList em Java

Resumo prático e direto para consulta rápida sobre manuseio de vetores e listas dinâmicas em Java.

---

## 1. Comparação Rápida: Array Estático vs. ArrayList

| Conceito | Array Estático (`String[]`) | ArrayList Dinâmico (`List<String>`) |
| :--- | :--- | :--- |
| **Tamanho** | **Fixo** (definido na criação) | **Dinâmico** (cresce automaticamente) |
| **Sintaxe de Criação** | `new String[3]` | `new ArrayList<>()` |
| **Como Adicionar** | `array[0] = "Java"` | `lista.add("Java")` |
| **Como Acessar** | `array[0]` | `lista.get(0)` |
| **Como Saber o Tamanho** | `array.length` | `lista.size()` |
| **Tipos Suportados** | Primitivos e Objetos | Apenas Objetos (`Integer`, `Double`, `String`...) |

---

## 2. Guia de Métodos do ArrayList (`java.util.List`)

* `add(elemento)`: Adiciona um item ao final da lista.
* `get(índice)`: Retorna o item da posição informada (começa em `0`).
* `set(índice, novoElemento)`: Altera o valor daquela posição.
* `remove(índice)` ou `remove(objeto)`: Remove um item da lista.
* `size()`: Retorna a quantidade total de itens.
* `contains(objeto)`: Retorna `true` se o item estiver na lista.
* `Collections.sort(lista)`: Ordena a lista em ordem alfabética ou numérica.

---

## 3. Estrutura do Projeto

* `br.com.dio.Main`: Classe principal de execução dos testes.
* `br.com.dio.ArraysVsArrayList`: Demonstração didática das diferenças de tamanho.
* `br.com.dio.ExemploArrayListPratico`: Exemplo das operações do dia a dia.
