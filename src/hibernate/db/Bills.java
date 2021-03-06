package hibernate.db;
// Generated Mar 9, 2014 9:21:17 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Bills generated by hbm2java
 */
public class Bills  implements java.io.Serializable {


     private int refNo;
     private Towns towns;
     private Tours tours;
     private Hotels hotels;
     private Date billDate;
     private int numberOfIndividuals;
     private Double amount;

    public Bills() {
    }

	
    public Bills(int refNo, int numberOfIndividuals) {
        this.refNo = refNo;
        this.numberOfIndividuals = numberOfIndividuals;
    }
    public Bills(int refNo, Towns towns, Tours tours, Hotels hotels, Date billDate, int numberOfIndividuals, Double amount) {
       this.refNo = refNo;
       this.towns = towns;
       this.tours = tours;
       this.hotels = hotels;
       this.billDate = billDate;
       this.numberOfIndividuals = numberOfIndividuals;
       this.amount = amount;
    }
   
    public int getRefNo() {
        return this.refNo;
    }
    
    public void setRefNo(int refNo) {
        this.refNo = refNo;
    }
    public Towns getTowns() {
        return this.towns;
    }
    
    public void setTowns(Towns towns) {
        this.towns = towns;
    }
    public Tours getTours() {
        return this.tours;
    }
    
    public void setTours(Tours tours) {
        this.tours = tours;
    }
    public Hotels getHotels() {
        return this.hotels;
    }
    
    public void setHotels(Hotels hotels) {
        this.hotels = hotels;
    }
    public Date getBillDate() {
        return this.billDate;
    }
    
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }
    public int getNumberOfIndividuals() {
        return this.numberOfIndividuals;
    }
    
    public void setNumberOfIndividuals(int numberOfIndividuals) {
        this.numberOfIndividuals = numberOfIndividuals;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }




}


