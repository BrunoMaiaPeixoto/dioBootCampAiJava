package br.com.dio.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Módulo 2 - Collections (Set)
 * Estrutura preparada para as próximas aulas do Bootcamp.
 */
public class ExemploSetPratico {

    public static void demonstrarOperacoes() {
        System.out.println("\n--- [AULA 3] OPERAÇÕES PRÁTICAS COM SET (CONJUNTOS) ---");
        Set<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Java"); // Duplicado ignorado automaticamente!

        System.out.pr0intln("Conjunto (sem duplicatas): " + linguagens);
        System.out.println("Tamanho do Set: " + linguagens.size());
    }
}
