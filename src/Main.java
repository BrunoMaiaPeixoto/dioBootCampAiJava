import br.com.dio.collections.list.ArraysVsArrayList;
import br.com.dio.collections.list.ExemploArrayListPratico;
import br.com.dio.collections.set.ExemploSetPratico;
import br.com.dio.collections.map.ExemploMapPratico;

import java.util.Scanner;

/**
 * Centralizador de Aulas do Bootcamp DIO Java & AI
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n==================================================");
            System.out.println("      BOOTCAMP DIO - JAVA & AI (PAINEL PRINCIPAL)  ");
            System.out.println("==================================================");
            System.out.println("1 - [List] Array Estático vs ArrayList Dinâmico");
            System.out.println("2 - [List] Operações Práticas com ArrayList");
            System.out.println("3 - [Set] Introdução ao HashSet (Próxima Aula)");
            System.out.println("4 - [Map] Introdução ao HashMap (Próxima Aula)");
            System.out.println("0 - Sair");
            System.out.print("Escolha o número da aula para executar: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        ArraysVsArrayList.demonstrarDiferenca();
                        break;
                    case 2:
                        ExemploArrayListPratico.demonstrarOperacoes();
                        break;
                    case 3:
                        ExemploSetPratico.demonstrarOperacoes();
                        break;
                    case 4:
                        ExemploMapPratico.demonstrarOperacoes();
                        break;
                    case 0:
                        System.out.println("Encerrando o painel de aulas. Bons estudos!");
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número do menu.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor digite um número.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
