package br.com.dio.collections.model;

import java.util.Objects;

public class User {

    // id é final — identificador imutável, não deve mudar após criação
    private final int id;
    private String name;
    private Integer age; // wrapper Integer para aceitar null e funcionar em Collections

    public User(int id, String name, Integer age) {
        if (id <= 0) {
            throw new IllegalArgumentException("O id deve ser maior que zero.");
        }
        this.name = Objects.requireNonNull(name, "O nome não pode ser nulo.");
        this.age = Objects.requireNonNull(age, "A idade não pode ser nula.");
        this.id = id;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Setters — não há setter para id pois é final
    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "O nome não pode ser nulo.");
    }

    public void setAge(Integer age) {
        this.age = Objects.requireNonNull(age, "A idade não pode ser nula.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return String.format("{'id': %d, 'name': '%s', 'age': %d}", id, name, age);
    }

    public int compareTo(User user) {
        if (this.age == user.age) {
            return this.name.compareTo(user.name);
        } else if (this.age > user.age) {
            return 1;
        } else {
            return -1;
        }
    }
}