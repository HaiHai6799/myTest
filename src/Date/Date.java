/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

/**
 *
 * @author Hai
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){
        if((day >= 1 && day <= 31) && (month >= 1 && month <= 12) && (year >= 1900 && year <= 9999)){
            this.day =  day;
            this.month = month;
            this.year = year;
        }
        else{
            System.out.println("No input validation needed.");
        }
        
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
   public void setDate(int day, int month, int year){
       if((day >= 1 && day <= 31) || (month >= 1 && month <= 12) || (year >= 1900 && year <= 9999)){
            this.day =  day;
            this.month = month;
            this.year = year;
        }
        else{
            System.out.println("No input validation needed.");
        }
        
   } 

    @Override
    public String toString() {
        return "Date:" + day + "/" + month + "/" + year;
    }
   
}
