package br.com.dio.collections.map;
import java.util.*;

/**
 * Módulo 3 - Collections (Map)
 * Estrutura de MAP para aulas do Bootcamp.
 */
public class ExemploMapPratico {

    public static void demonstrarOperacoes() {

        System.out.println("\n==================================================");
        System.out.println("       AULA PRÁTICA: MAP EM JAVA  ");
        System.out.println("==================================================");

        // 1. Instanci Map (Interface Map -> Implementação HashMap)
        // Estrutura de Chave-Valor (Key-Value)
        // Regra de Ouro: As chaves (Keys) são ÚNICAS. Os valores (Values) podem se
        // repetir.
        Map<String, Double> User = new HashMap<>();

        User.put("Bruno", 9.5);
        User.put("Camila", 8.0);
        User.put("Carlos", 7.5);
        User.put("Daniela", 6.0);
        User.put("Ana", 10.0);
        System.out.println("Map inicial: " + User);

        // put com chave já existente -> ATUALIZA/SOBRESCREVE o valor antigo!
        Double notaAntiga = User.put("Carlos", 6.5);
        System.out.println("Nota antiga do Carlos: " + notaAntiga + " | Novo Map: " + User);

        // putIfAbsent: só insere se a chave NÃO existir no mapa
        User.putIfAbsent("Bruno", 10.0); // Não vai alterar Bruno (já existe)
        User.putIfAbsent("Eduardo", 6.5); // Vai inserir Eduardo
        System.out.println("Após putIfAbsent: " + User);

        System.out.println("\n--- 2. BUSCA E ACESSO (get, getOrDefault, containsKey, containsValue) ---");
        // .get(chave): retorna o valor associado ou null se não existir
        System.out.println("Nota da Camila: " + User.get("Camila"));
        System.out.println("Nota do Rodrigo (não cadastrado): " + User.get("Rodrigo"));

        // .getOrDefault(chave, valorPadrao): evita NullPointerException retornando um
        // padrão caso não ache
        System.out.println("Nota do Rodrigo (com padrão): " + User.getOrDefault("Rodrigo", 0.0));

        // .containsKey e .containsValue: verificações booleanas de existência
        System.out.println("Existe aluno 'Ana'? " + User.containsKey("Ana"));
        System.out.println("Existe alguém com nota 10.0? " + User.containsValue(10.0));
        System.out.println("Total de registros (size): " + User.size());

        System.out.println("\n--- 3. REMOÇÃO (remove) ---");
        // .remove(chave): remove o par e retorna o valor removido
        User.remove("Eduardo");
        System.out.println("Após remover 'Eduardo': " + User);

        // .remove(chave, valor): remove SOMENTE se a chave estiver associada a esse
        // valor exato
        boolean removeuIncorreto = User.remove("Bruno", 5.0); // falso, nota é 9.5
        System.out.println("Tentou remover 'Bruno' com nota 5.0: " + removeuIncorreto);

        System.out.println("\n--- 4. FORMAS DE ITERAÇÃO (keySet, values, entrySet) ---");

        // A) Iterando apenas pelas CHAVES (keySet)
        System.out.println("\nA) Lista de Alunos (Chaves):");
        for (String nomeAluno : User.keySet()) {
            System.out.println("   Aluno: " + nomeAluno);
        }

        // B) Iterando apenas pelos VALORES (values)
        System.out.println("\nB) Lista de Notas (Valores):");
        for (Double nota : User.values()) {
            System.out.println("   Nota: " + nota);
        }

        // C) Iterando pelo PAR CHAVE-VALOR (entrySet) - FORMA MAIS EFICIENTE
        System.out.println("\nC) Alunos e Notas (Map.Entry):");
        for (Map.Entry<String, Double> entry : User.entrySet()) {
            System.out.println("   Aluno: " + entry.getKey() + " -> Nota: " + entry.getValue());
        }

        // D) Iteração funcional moderna (Java 8+ forEach)
        System.out.println("\nD) Iteração funcional (Lambda):");
        User.forEach((nome, nota) -> System.out.println("   " + nome + " obteve " + nota));

        System.out.println("\n--- 5. COMPARATIVO: HashMap vs LinkedHashMap vs TreeMap ---");

        // HashMap: Não garante nenhuma ordem (performance O(1) de busca/inserção)
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("SP", "São Paulo");
        hashMap.put("RJ", "Rio de Janeiro");
        hashMap.put("MG", "Minas Gerais");
        hashMap.put("BA", "Bahia");
        System.out.println("HashMap (ordem indefinida/hash): " + hashMap);

        // LinkedHashMap: Mantém a ORDEM DE INSERÇÃO
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("SP", "São Paulo");
        linkedHashMap.put("RJ", "Rio de Janeiro");
        linkedHashMap.put("MG", "Minas Gerais");
        linkedHashMap.put("BA", "Bahia");
        System.out.println("LinkedHashMap (ordem de inserção): " + linkedHashMap);

        // TreeMap: Mantém ordenado pela ORDEM NATURAL das Chaves (Alfabética /
        // Numérica)
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("SP", "São Paulo");
        treeMap.put("RJ", "Rio de Janeiro");
        treeMap.put("MG", "Minas Gerais");
        treeMap.put("BA", "Bahia");
        System.out.println("TreeMap (ordem natural das chaves): " + treeMap);
    }
}
