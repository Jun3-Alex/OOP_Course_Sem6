package OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.service;

import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.Student;

import java.util.List;
/*Используем принцип разделения интерфейсов, чтобы разбить сортировки на более узкие интерфейсы*/

public interface SortFromFullName extends StudentSortService {

    @Override
    List<Student> sortStudents();
}
