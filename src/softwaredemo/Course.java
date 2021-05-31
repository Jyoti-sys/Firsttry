/*
 * Jyoti
 * Student Id: 991628078
 * SYST10199 Web Programming
 */
package softwaredemo;

import studentapp_1.Student;

/**
 *
 * @author Bogambo
 */
public class Course {
    private String name;
    private int ID;
  //  String[] students= new String[20];
    Student[] students = new Student[20];
    private int nbrOfStudents=0;

    public Course() {
    }    
    public Course(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbrOfStudents() {
        return nbrOfStudents;
    }
    void addStudent(Student st){
        students[nbrOfStudents]=st;
        ++nbrOfStudents;    
    }
    Student[] getStudentList(){
        return students;    
    }
    void displayStudents(){
        for(int i=0;i <nbrOfStudents ;i++){
            System.out.println(students[i].toString());
            System.out.println("--------------");            
        }
      
    
    
    }
    

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", ID=" + ID + ", nbrOfStudents=" + nbrOfStudents + '}';
    }
    
    
    
    
            
    
}

