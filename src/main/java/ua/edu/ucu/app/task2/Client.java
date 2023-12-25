package ua.edu.ucu.app.task2;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Client {
    private static long count = 0;

    private final long id;

    @Setter
    private String name;

    @Setter
    private int age;

    @Setter
    private Gender sex;

    @Setter
    private String email;

    public Client(String name, int age, Gender sex, String email) {
        this.id = count + 1;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
