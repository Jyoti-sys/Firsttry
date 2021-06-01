/*
 * Jyoti
 * Student Id: 991628078
 * SYST10199 Web Programming
 jotkalsi
 */
package softwaredemo;

/**
 *
 * @author Bogambo
 * date:31 may
 */
public class Employ {
    String name;
    int ID;
    Employee manger;

    public Employ() {
    }
    
    public Employ(String name, int ID, Employee manger) 
    {
        this.name = name;
        this.ID = ID;
        this.manger = manger;
    }
}
