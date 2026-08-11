package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Módulo 1 - Collections (List)
 * Demonstração dos métodos mais utilizados da interface List e classe ArrayList.
 */
public class ExemploArrayListPratico {

    public static void demonstrarOperacoes() {
        System.out.println("\n--- [AULA 2] OPERAÇÕES PRÁTICAS COM ARRAYLIST ---");

        List<String> alunos = new ArrayList<>();

        // Adicionar (add)
        alunos.add("Carlos");
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Daniela");
        System.out.println("1. Lista inicial: " + alunos);

        // Acessar (get) e Tamanho (size)
        System.out.println("2. Primeiro aluno: " + alunos.get(0));
        System.out.println("3. Total de alunos: " + alunos.size());

        // Verificar existência (contains)
        System.out.println("4. Contém 'Ana'? " + alunos.contains("Ana"));

        // Atualizar (set)
        alunos.set(0, "Carlos Alberto");
        System.out.println("5. Após atualizar índice 0: " + alunos);

        // Remover (remove)
        alunos.remove("Bruno");
        System.out.println("6. Após remover 'Bruno': " + alunos);

        // Ordenar (Collections.sort)
        Collections.sort(alunos);
        System.out.println("7. Ordem alfabética: " + alunos);

        // Iterar (for-each)
        System.out.println("8. Iterando sobre a lista:");
        for (String aluno : alunos) {
            System.out.println("   - " + aluno);
        }
    }
}
