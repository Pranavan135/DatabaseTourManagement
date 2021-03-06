package hibernate.db;
// Generated Mar 9, 2014 9:21:17 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Customers generated by hbm2java
 */
public class Customers  implements java.io.Serializable {


     private int id;
     private String name;
     private Set tourses = new HashSet(0);

    public Customers() {
    }

	
    public Customers(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Customers(int id, String name, Set tourses) {
       this.id = id;
       this.name = name;
       this.tourses = tourses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getTourses() {
        return this.tourses;
    }
    
    public void setTourses(Set tourses) {
        this.tourses = tourses;
    }




}


