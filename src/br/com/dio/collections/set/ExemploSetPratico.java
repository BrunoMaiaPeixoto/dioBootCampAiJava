package br.com.dio.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.collections.model.User;

/**
 * Módulo 2 - Collections (Set)
 * Estrutura preparada para as aulas do Bootcamp.
 */
public class ExemploSetPratico {

    public static void demonstrarOperacoes() {
        Set<User> users = new LinkedHashSet<>();
        users.add(new User(1, "João", 24));
        users.add(new User(2, "Bruno", 22));
        users.add(new User(3, "Maria",19));
        users.add(new User(4, "Leo", 29));
        users.add(new User(5, "Juca",28));
        users.add(new User(6, "Hugo",25));
        users.add(new User(7, "Jurandir",33));
        users.add(new User(8, "Judite",38));

        users.removeIf(user -> user.getId() >= 7);

        System.out.println(users);

    }

}
