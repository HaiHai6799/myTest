/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;


/**
 *
 * @author Hai
 */
public class Book {
    DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner sc= new Scanner(System.in);
    private String book_code;
    private LocalDate date;
    private float cost;
    private int amount;
    private String producer;
    public Book(){
        super();
        this.book_code= "";
        this.cost=0;
        this.amount=0;
    }

    public String getBook_code() {
        return book_code;
    }

    public void setBook_code(String book_code) {
        this.book_code = book_code;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.book_code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.book_code, other.book_code)) {
            return false;
        }
        return true;
    }
    
    public Book(String book_code,LocalDate date,float cost,int amount,String producer){
        super();
        this.book_code= book_code;
        this.date= date;
        this.cost= cost;
        this.amount= amount;
        this.producer=producer;
    }
    public void nhap(){
        boolean test;
        do{
            test= true;
            try{
                System.out.println("Enter book code: ");
                String code= sc.nextLine();
                if(code.length()>0){
                    this.setBook_code(code);
                }
                else{
                    test= false;
                    System.out.println("Enter error. Please enter again.");
                }
            }catch(NullPointerException e){
                System.out.println("Error: "+e.getMessage());
                test= false;
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
                test= false;
            }
        }while(test != true);
        
        do{
            test = true;
            try{
                System.out.println("Enter date(dd/MM/yyyy): ");
                String strdate= sc.nextLine();
                LocalDate date= LocalDate.parse(strdate,df);
                this.setDate(date);
            }catch(NullPointerException e){
                test= false;
                System.out.println("Error: "+e.getMessage());
            }catch(Exception e){
                test = false;
                System.out.println("Error: "+e.getMessage());
            }
        }while(test != true);
        
        do{
            test= true;
            try{
                System.out.println("Enter cost: ");
                Float cost= Float.parseFloat(sc.nextLine());
                if(cost>0){
                    this.setCost(cost);
                }
                else{
                    test = false;
                    System.out.println("Enter Error. Please enter again.");
                }
            }catch(NullPointerException | NumberFormatException e){
                test = false;
                System.out.println("Error: "+e.getMessage());
            }
        }while (test != true);
        
        do{
            test = true;
            try{
                System.out.println("Enter amount: ");
                int amount = Integer.parseInt(sc.nextLine());
                if(amount>0){
                    this.setAmount(amount);
                }else{
                    test = false;
                    System.out.println("Enter error.Please enter again.");
                }
            }catch(NumberFormatException e){
                test = false;
                System.out.println("Error: "+e.getMessage());
            }
        }while(test != true);
        
        do{
            test = true;
            try{
                System.out.println("Enter producer's name: ");
                String producer= sc.nextLine();
                if(producer.length()>2){
                    this.setProducer(producer);
                }else{
                    test = false;
                    System.out.println("Enter Error. Please enter again.");
                }
            }catch(NullPointerException e){
                test = false;
                System.out.println("Error: "+e.getMessage());
            }catch(Exception e){
                test = false;
                System.out.println("Error: "+e.getMessage());
            }
        }while(test != true);
    }

    @Override
    public String toString() {
        return "Book{" + "book_code=" + book_code + ", date=" + date + ", cost=" + cost + ", amount=" + amount + '}';
    }
}
class StandardBook extends Book{
   
    private int status;
    public StandardBook(){
        super();
        this.status=0;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public StandardBook(String book_code,LocalDate date,float cost,int amount,String producer,int status){
        super(book_code,date,cost,amount,producer);
        this.setStatus(status);
    }
    @Override
    public void nhap(){
        boolean test;
        super.nhap();
        
        
        do{
            test = true;
            try{
                System.out.println("Enter book's status: ");
                int status= Integer.parseInt(sc.nextLine());
                if(status ==1 || status == 2){
                    this.setStatus(status);
                }else{
                    test = false;
                    System.out.println("Enter Error. Please enter again.");
                }
            }catch(NumberFormatException | NullPointerException e){
                test = false;
                System.out.println("Error: "+e.getMessage());
            }
        }while(test != true);
    }
    
    public float getMoneySum(){
        if(this.getStatus()== 1)
            return this.getCost()*this.getAmount();
        else{
            return (float) (this.getCost()*this.getAmount()*0.5);
        }
    }
    @Override
    public String toString() {
        String s = "";
        if(this.status == 1){
            s= "New";
        } else if(this.status == 2){
            s="Old";
        }
        return "StandardBook{"+super.toString() + ", status=" + s + ",MoneySum= "+ this.getMoneySum()+ '}';
    }
}
class ReferenceBook extends Book{
    private float tax;
    public ReferenceBook(){
        super();
        this.tax=0;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
    public ReferenceBook(String book_code,LocalDate date,float cost,int amount,String producer,float tax){
        super(book_code,date,cost,amount,producer);
        this.tax= tax;
    }
    @Override
    public void nhap(){
        super.nhap();
        boolean test;
        do{
            test = true;
            try{
                System.out.println("Enter book's tax: ");
                float tax= Float.parseFloat(sc.nextLine());
                if(tax>0){
                    this.setTax(tax);
                }else{
                    test = false;
                    System.out.println("Enter Error. Please enter again.");
                }
            }catch(NumberFormatException | NullPointerException e){
                test = false;
                System.out.println("Error: "+e.getMessage());
            }
        }while(test != true);
    }
    public float getMoneySum(){
        return this.getCost()*this.getAmount()+this.getTax();
    }

    @Override
    public String toString() {
        return "ReferenceBook{"+super.toString() + "tax=" + tax + ",MoneySum= "+this.getMoneySum()+'}';
    }
}
