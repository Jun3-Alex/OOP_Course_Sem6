package OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.service;

import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.Student;
import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.StudentGroup;
import OOP_Course.Lesson6.OOPSeminar4.src.main.java.ru.gb.oseminar.data.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    private final StudentSearchService searchService;
    private final StudentSortService sortService;


    public StudentGroupService(StudentSearchService searchService, Teacher teacher, List<Student> students, StudentSortService sortService) {
        this.sortService = sortService;
        this.studentGroup = new StudentGroup(teacher, students);
        this.searchService = searchService;
    }
/*Переопределяем метод поиска студента*/
    public StudentGroupService(StudentSortService sortService) {
        this.sortService = sortService;
        this.searchService = new StudentSearchService() {
            @Override
            public Student findStudent(String firstName, String secondName) {
                return null;
            }
        };

    }


    public StudentSearchService getSearchService() {
        return searchService;
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
    public Student getStudentFromStudentGroup(String firstName, String secondName){
        return searchService.findStudent(firstName, secondName);
    }

    public List<Student> getSortedStudentGroup() {
        return sortService.sortStudents();
    }

    public List<Student> getSortedByFIOStudentGroup() {
        return sortService.sortStudents();
    }

//    public Student getStudentFromStudentGroup(String firstName, String secondName){
//        Iterator<Student> iterator = studentGroup.iterator();
//        List<Student> result = new ArrayList<>();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            if(student.getFirstName().equalsIgnoreCase(firstName)
//               && student.getSecondName().equalsIgnoreCase(secondName)){
//                result.add(student);
//            }
//        }
//        if(result.size() == 0){
//            throw new IllegalStateException(
//                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
//            );
//        }
//        if(result.size() != 1){
//            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
//        }
//        return result.get(0);
//    }

//    public List<Student> getSortedStudentGroup(){
//        List<Student> students = new ArrayList<>(studentGroup.getStudents());
//        Collections.sort(students);
//        return students;
//    }
//
//    public List<Student> getSortedByFIOStudentGroup(){
//        List<Student> students = new ArrayList<>(studentGroup.getStudents());
//        students.sort(new UserComparator<Student>());
//        return students;
//    }
}
