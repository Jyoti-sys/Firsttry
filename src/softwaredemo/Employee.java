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
public class Employee{
    String name;
    int ID;
    Employee[] mangers= new Employee[5];
    int nbrOfManagers=0;

    public Employee() {
    }
    
    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;       
    }
    void addManager(Employee mng){
         mangers[nbrOfManagers]= mng;
         ++nbrOfManagers;
    }
    void displayMangers(){
        for(int i=0;i <nbrOfManagers ;i++){
            System.out.println(mangers[i].name);
            System.out.println("--------------");            
        }
      
    
    
    }
    
}

    

