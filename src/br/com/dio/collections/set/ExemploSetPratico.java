package br.com.dio.collections.set;

import  java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Módulo 2 - Collections (Set)
 * Estrutura preparada para as aulas do Bootcamp.
 */
public class ExemploSetPratico {

    public static void demonstrarOperacoes() {
        Set<User> users = new LinkedHashSet<>();
        users.add(new User(1, "João"));
        users.add(new User(2, "Bruno"));
        users.add(new User(3, "Maria"));
        users.add(new User(4, "Leo"));
        users.add(new User(5, "Juca"));
        users.add(new User(6, "Hugo"));
        users.add(new User(7,"Jurandir"));
        users.add(new User(8,"Judite"));


        users.removeIf(user -> user.getId() >= 7);

        System.out.println(users);

    }

}

