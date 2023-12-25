package ua.edu.ucu.app.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        User user = Student.builder()
                .name("Marta")
                .age(19)
                .mark(88)
                .mark(100)
                .grades(Arrays.asList(1,2,3))
                .gender("f").build();
        System.out.println(user);
    }
}