package br.com.dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exemplos simples e diretos dos métodos mais utilizados do ArrayList no dia a dia.
 */
public class ExemploArrayListPratico {

    public static void demonstrarOperacoes() {
        // Criação de uma lista de nomes de alunos
        List<String> alunos = new ArrayList<>();

        // A. ADICIONAR (add)
        alunos.add("Carlos");
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Daniela");
        System.out.println("Lista inicial de alunos: " + alunos);

        // B. ACESSAR (get) E TAMANHO (size)
        System.out.println("Primeiro aluno (índice 0): " + alunos.get(0));
        System.out.println("Total de alunos: " + alunos.size());

        // C. VERIFICAR SE EXISTE (contains)
        System.out.println("A lista contém 'Ana'? " + alunos.contains("Ana"));

        // D. ATUALIZAR (set)
        alunos.set(0, "Carlos Alberto"); // Substitui "Carlos" por "Carlos Alberto"
        System.out.println("Após atualizar índice 0: " + alunos);

        // E. REMOVER (remove)
        alunos.remove("Bruno"); // Remove pelo valor
        System.out.println("Após remover 'Bruno': " + alunos);

        // F. ORDENAR (Collections.sort)
        Collections.sort(alunos); // Ordena em ordem alfabética (A-Z)
        System.out.println("Lista em ordem alfabética: " + alunos);

        // G. ITERAR (Percorrer com for-each)
        System.out.println("\nPercorrendo a lista com for-each:");
        for (String aluno : alunos) {
            System.out.println(" - " + aluno);
        }
    }
}
