package br.com.dio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe didática para comparar Array Tradicional (Estático) e ArrayList (Dinâmico).
 */
public class ArraysVsArrayList {

    public static void demonstrarDiferenca() {
        // 1. ARRAY ESTÁTICO (Tamanho Fixo)
        // O tamanho 3 é fixo e não pode mudar após a criação.
        String[] arrayEstatico = new String[3];
        arrayEstatico[0] = "Java";
        arrayEstatico[1] = "Python";
        arrayEstatico[2] = "C#";

        System.out.println("1. Array Estático (tamanho fixo = " + arrayEstatico.length + "):");
        System.out.println("   Conteúdo: " + Arrays.toString(arrayEstatico));

        // 2. ARRAYLIST (Tamanho Dinâmico)
        // Cresce e diminui automaticamente conforme adicionamos elementos.
        List<String> listaDinamica = new ArrayList<>();
        listaDinamica.add("Java");
        listaDinamica.add("Python");
        listaDinamica.add("C#");
        listaDinamica.add("JavaScript"); // Adiciona o 4º item sem problemas!

        System.out.println("\n2. ArrayList Dinâmico (tamanho atual = " + listaDinamica.size() + "):");
        System.out.println("   Conteúdo: " + listaDinamica);
    }
}
