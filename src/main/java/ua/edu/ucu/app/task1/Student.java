package ua.edu.ucu.app.task1;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@SuperBuilder
@ToString(callSuper = true)
public class Student extends User{

    @Singular("mark")
    private List<Integer> grades;

}
