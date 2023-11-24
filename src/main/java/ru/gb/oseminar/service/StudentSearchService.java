package OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.service;

import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.Student;

/*Интерфейс для поиска студента.
* Применяем принцип единственной ответственности SRP,
* разбив класс StudentGroupService на отдельные классы*/
public interface StudentSearchService {

    Student findStudent(String firstName, String secondName);
}
