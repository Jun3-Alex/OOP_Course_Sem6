package OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.service;

import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.Student;
import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.StudentGroup;

import java.util.List;

/*Согласно принципу Открытости/Закрытости,
создаем абстрактный класс для реализации его методов
в наследниках.
Так же согласно принципу Liskov Substitution,
создаем абстрактный класс для реализации его методов,
чтобы работать с наследниками через полиморфизм.
 */

abstract class StudentGroupQueryService {
    abstract Student findStudent(String firstName, String secondName);
    abstract List<Student> sortStudents(StudentGroup studentGroup);
}
