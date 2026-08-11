package br.com.dio.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Módulo 3 - Collections (Map)
 * Estrutura preparada para as próximas aulas do Bootcamp.
 */
public class ExemploMapPratico {

    public static void demonstrarOperacoes() {
        System.out.println("\n--- [AULA 4] OPERAÇÕES PRÁTICAS COM MAP (CHAVE-VALOR) ---");
        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 9.5);
        notas.put("Bruno", 8.0);

        System.out.println("Map de notas: " + notas);
        System.out.println("Nota da Ana: " + notas.get("Ana"));
    }
}
