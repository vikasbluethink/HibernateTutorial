package NEC.hibernateTutorial;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        StudentDao studentDao = new StudentDao();
        Student student = new Student("John", "Doe", "doejohn@javaguides.com");
        studentDao.saveStudent(student);

        List < Student > students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName()));
    }
}
