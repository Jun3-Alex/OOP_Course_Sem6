package OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.service;

import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.Student;
import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.StudentGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Класс для поиска студента.
 * Применяем принцип единственной ответственности SRP,
 * разбив класс StudentGroupService на отдельные классы*/

public class StudentSearch {
    private final StudentGroup studentGroup;

    public StudentSearch(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.isEmpty()){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }
}
