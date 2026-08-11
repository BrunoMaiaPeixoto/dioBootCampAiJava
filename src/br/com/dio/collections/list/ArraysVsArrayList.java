package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Módulo 1 - Collections (List)
 * Comparação didática entre Array Estático (tamanho fixo) e ArrayList (tamanho dinâmico).
 */
public class ArraysVsArrayList {

    public static void demonstrarDiferenca() {
        System.out.println("\n--- [AULA 1] ARRAY ESTÁTICO VS ARRAYLIST ---");

        // 1. ARRAY ESTÁTICO (Tamanho Fixo)
        String[] arrayEstatico = new String[3];
        arrayEstatico[0] = "Java";
        arrayEstatico[1] = "Python";
        arrayEstatico[2] = "C#";

        System.out.println("1. Array Estático (tamanho fixo = " + arrayEstatico.length + "):");
        System.out.println("   Conteúdo: " + Arrays.toString(arrayEstatico));

        // 2. ARRAYLIST (Tamanho Dinâmico)
        List<String> listaDinamica = new ArrayList<>();
        listaDinamica.add("Java");
        listaDinamica.add("Python");
        listaDinamica.add("C#");
        listaDinamica.add("JavaScript"); // Adiciona dinamicamente sem limite fixo

        System.out.println("\n2. ArrayList Dinâmico (tamanho atual = " + listaDinamica.size() + "):");
        System.out.println("   Conteúdo: " + listaDinamica);
    }
}
