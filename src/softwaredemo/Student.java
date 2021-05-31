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
public class Student {

     private int ID;
     private String name;
     private String[] courses= new String[20];
     private int nbrOfCourses=0;
    // constructors
    public Student() {
    }

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
     void addCourse(String course) {
        courses[nbrOfCourses]=course;
        ++nbrOfCourses;
        
    }
     int getNbrOfCourses(){
         return nbrOfCourses;
     
     }
     
     
//    public String[] getCourses() {
//        return courses;
//    }
//
//    public void setCourses(String[] courses) {
//        this.courses = courses;
//    }    
    
     @Override
    public String toString() {
        String message="Information \n";
        message += "ID: "+ ID +"\n";
        message += "Name: "+ name + "\n";
        message+= "Courses: ";
        for(int i=0;i<nbrOfCourses;i++)
            message += courses[i] + "  ";
        return message;
    }

   

   
   

 
    
    
    
    
      
  

}

  
