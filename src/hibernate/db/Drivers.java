package hibernate.db;
// Generated Mar 9, 2014 9:21:17 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Drivers generated by hbm2java
 */
public class Drivers  implements java.io.Serializable {


     private int id;
     private String name;
     private String address;
     private String tpNo;
     private Set routeses = new HashSet(0);
     private Set tourses = new HashSet(0);

    public Drivers() {
    }

	
    public Drivers(int id, String name, String address, String tpNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tpNo = tpNo;
    }
    public Drivers(int id, String name, String address, String tpNo, Set routeses, Set tourses) {
       this.id = id;
       this.name = name;
       this.address = address;
       this.tpNo = tpNo;
       this.routeses = routeses;
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
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTpNo() {
        return this.tpNo;
    }
    
    public void setTpNo(String tpNo) {
        this.tpNo = tpNo;
    }
    public Set getRouteses() {
        return this.routeses;
    }
    
    public void setRouteses(Set routeses) {
        this.routeses = routeses;
    }
    public Set getTourses() {
        return this.tourses;
    }
    
    public void setTourses(Set tourses) {
        this.tourses = tourses;
    }




}


