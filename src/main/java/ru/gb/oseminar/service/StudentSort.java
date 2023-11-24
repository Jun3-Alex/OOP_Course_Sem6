package OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.service;

import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.Student;
import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.StudentGroup;
import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort implements StudentSortService{
    private final StudentGroup studentGroup;

    public StudentSort(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public List<Student> sortStudents() {
        return null;
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
