package br.com.dio.collections;

import br.com.dio.collections.model.User;

public class ExemploPrimitivos {

    public static void main(String[] args) {

        // Tipos primitivos — armazenados na Stack, não aceitam null
        boolean b = true;
        byte    c = 100;
        short   d = 30000;
        int     e = 2_000_000;
        long    f = 9_000_000_000L; // sufixo "L" obrigatório para long literal
        char    g = 'A';
        double  h = 3.14159;
        float   i = 3.14f;          // sufixo "f" obrigatório para float literal

        System.out.println("=== Primitivos ===");
        System.out.println("boolean: " + b);
        System.out.println("byte:    " + c);
        System.out.println("short:   " + d);
        System.out.println("int:     " + e);
        System.out.println("long:    " + f);
        System.out.println("char:    " + g);
        System.out.println("double:  " + h);
        System.out.println("float:   " + i);

        // Wrappers — objetos no Heap, aceitam null, obrigatórios em Collections
        Boolean   j = true;
        Byte      k = 100;
        Short     l = 30000;
        Integer   m = 2_000_000;
        Long      n = 9_000_000_000L;
        Character o = 'A';
        Double    p = 3.14159;
        Float     q = 3.14f;

        System.out.println("\n=== Wrappers ===");
        System.out.println("Boolean:   " + j);
        System.out.println("Byte:      " + k);
        System.out.println("Short:     " + l);
        System.out.println("Integer:   " + m);
        System.out.println("Long:      " + n);
        System.out.println("Character: " + o);
        System.out.println("Double:    " + p);
        System.out.println("Float:     " + q);

        // Wrapper aceita null — primitivo não aceita
        Integer valorNulo = null;
        System.out.println("\nInteger null: " + valorNulo);

        // Verificação antes de fazer unboxing para evitar NullPointerException
        if (valorNulo != null) {
            int seguro = valorNulo;
            System.out.println("Unboxing seguro: " + seguro);
        }

        // Autoboxing: int → Integer / Unboxing: Integer → int (feito automaticamente pelo Java)
        int primitivo = 42;
        Integer wrapper = primitivo;
        int voltaPrimitivo = wrapper;
        System.out.println("\nAutoboxing:  int " + primitivo + " → Integer " + wrapper);
        System.out.println("Unboxing:    Integer " + wrapper + " → int " + voltaPrimitivo);

        // final em variável local impede reatribuição da referência
        final String nome = "Bruno";

        // final em objeto: a referência não pode ser trocada, mas o conteúdo pode mudar
        final StringBuilder sb = new StringBuilder("Olá");
        sb.append(", mundo!");
        System.out.println("\nfinal StringBuilder: " + sb);

        // Usando setters da classe User após criação do objeto
        User usuario = new User(1, "Bruno", 22);
        usuario.setName("Bruno Atualizado");
        usuario.setAge(23);
        System.out.println(usuario);
    }
}
