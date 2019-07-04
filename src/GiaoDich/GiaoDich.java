/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDich;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class GiaoDich {
   DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String code;
    private LocalDate date;
    private float cost;
    private int amount;

    public GiaoDich() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public GiaoDich(String code, LocalDate date, float cost, int amount) {
        this.code = code;
        this.date = date;
        this.cost = cost;
        this.amount = amount;
    }
    public void nhap(){
         
        Scanner sc= new Scanner(System.in);
        boolean bool;
        do{
            bool= true;
            try{
                System.out.println("Enter code: ");
                String code= sc.nextLine();
                code= code.trim();
                if(code.length()>0)
                {
                    this.setCode(code);
                }
                else {
                    bool= false;
                }
            }catch(Exception e){
                System.out.println("Eror:"+ e.getMessage());
            }
        }while(bool != true);
        
        do{
            bool = true;
            try{
                System.out.println("Enter date");
                String ngay= sc.nextLine();
                
                LocalDate date= LocalDate.parse(ngay,f);
                this.setDate(date);
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }while(bool != true);
        
        do{
            bool = true;
            try{
                System.out.println("Enter cost: ");
                float cost= Float.parseFloat(sc.nextLine());
                if(cost>0){
                    this.setCost(cost);
                } else{
                    bool = false;
                }
            }catch(NullPointerException e){
                System.out.println("Error: "+e.getMessage());
                bool = false;
            }
        }while(bool != true);
        
        do{
            bool = true;
            try{
                System.out.println("Enter amount: ");
                int amount= Integer.parseInt(sc.nextLine());
                if(amount>0){
                    this.setAmount(amount);
                } else{
                    bool = false;
                }
            }catch(NullPointerException e){
                System.out.println("Error: "+e.getMessage());
                bool = false;
            }
        }while(bool != true);
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "code=" + code + ", date=" + date + ", cost=" + cost + ", amount=" + amount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.code);
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
        final GiaoDich other = (GiaoDich) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }
    
}
class GoldTrading extends GiaoDich {
    private int goldtype;

    public GoldTrading() {
        super();
        this.goldtype=0;
    }

    public int getGoldtype() {
        return goldtype;
    }

    public void setGoldtype(int goldtype) {
        this.goldtype = goldtype;
    }
    public GoldTrading(String code,LocalDate date,float cost,int amount,int goldtype){
        super(code,date,cost,amount);
        this.goldtype = goldtype;
    }
    @Override
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        boolean bool;
        super.nhap();
        do{
            bool = true;
            try{
                System.out.println("Enter golden type: ");
                int type= Integer.parseInt(sc.nextLine());
                if(type == 1 | type == 2){
                    this.setGoldtype(type);
                } else{
                    bool= false;
                }
            }catch(NullPointerException e){
                System.out.println("Error: "+e.getMessage());
            }
        }while(bool != true);
    }
    public float MoneySum(){
        return this.getCost()*this.getAmount();
    }

    @Override
    public String toString() {
        String s="";
        if(this.getGoldtype() == 1){
            s= "SJC";
        } else if(this.getGoldtype() == 2){
            s="9999";
        }
        return "GoldTrading{"+super.toString() + "goldtype=" + s + ",total= "+this.MoneySum() + '}';
    } 
    
}
class MoneyTrading extends GiaoDich{
    private float exchangerate;
    private int moneytype;
    public MoneyTrading(){
        super();
        this.exchangerate=0;
        this.moneytype=0;
    }

    public float getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(float exchangerate) {
        this.exchangerate = exchangerate;
    }

    public int getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(int moneytype) {
        this.moneytype = moneytype;
    }
    public MoneyTrading(String code, LocalDate date,float cost, int amount, float exchangerate, int moneytype){
        super(code, date, cost, amount);
        this.exchangerate = exchangerate;
        this.moneytype = moneytype;
    }
    @Override
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        boolean bool;
        super.nhap();
        
        do{
            bool = true;       
            try{
            System.out.println("Enter exchangerate: ");
            float rate= Float.parseFloat(sc.nextLine());
            if(rate>0){
                this.setExchangerate(rate);
            } else{
                bool = false;
            }
            }catch(NullPointerException e){
                System.out.println("Error: "+e.getMessage());
                bool = false;
            }
        }while(bool != true);
        
        do{
            bool = true;       
            try{
            System.out.println("Enter money type: ");
            int type= Integer.parseInt(sc.nextLine());
            if(type == 1 || type == 2 || type == 3){
                this.setMoneytype(type);
            } else{
                bool = false;
            }
            }catch(NullPointerException e){
                System.out.println("Error: "+e.getMessage());
                bool = false;
            }
        }while(bool != true);
    }
    public float MoneySum(){
        if(this.getMoneytype() == 1 || this.getMoneytype() == 2){
            return this.getCost()*this.getAmount()* this.getExchangerate();
        } else {
            return this.getCost()*this.getMoneytype();
        }
    }

    @Override
    public String toString() {
        String s ="";
        switch (this.getMoneytype()) {
            case 1:
                s="USD";
                break;
            case 2:
                s="Euro";
                break;
            default:
                s="VND";
                break;
        }
        return "MoneyTrading{"+super.toString() + "exchangerate=" + exchangerate + ", moneytype=" + s + ",total= "+ this.MoneySum() + '}';
    }
    
}
