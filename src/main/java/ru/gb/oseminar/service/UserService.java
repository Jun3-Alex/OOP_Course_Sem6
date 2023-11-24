package OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
