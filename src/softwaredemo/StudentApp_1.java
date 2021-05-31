/*
 * Jyoti
 * Student Id: 991628078
 * SYST10199 Web Programming
 */
package softwaredemo;

/**
 *
 * @author Bogambo
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StudentApp_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Course course = new Course("Java",100);
     Student st = new Student();
     st.setID(100);
     st.setName("David");
     course.addStudent(st);
     
     Student st2 = new Student();
     st2.setID(200);
     st2.setName("Mike");
     course.addStudent(st2);
     
     
     course.displayStudents();
        
        
        
        
        
        
        
        
        
        
//        Student st = new Student();
//        st.setID(100);
//        st.setName("David");
//        String[] courses={"HTML", "Java", "C#"};
//      // st.setCourses(courses);      
//        
//        st.addCourse("java");//index =0  nb=1
//        st.addCourse("C#");//index (nb) =1  nb=2
//        st.addCourse("HTML"); // 2   3
//        st.addCourse("DB");
//        System.out.println("The number of courses " + st.getNbrOfCourses());
//        System.out.println(st.toString());
    }
    
}

    

