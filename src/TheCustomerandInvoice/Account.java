/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheCustomerandInvoice;

/**
 *
 * @author Hai
 */
public class Account {
    private int id;
    private TheCustomer customer;
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(int id, TheCustomer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, TheCustomer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public TheCustomer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.customer.getName() + "(" + this.id + ")," + "balance=$" + (Math.round(this.balance*100))/100.0 ;
    }
    
    public String getCustomerName(){
        return this.customer.getName();
    }
    public Account deposit(double amount){
        this.setBalance(this.balance + amount);
        return this;
    }
    public Account withdraw(double amount){
        if(this.balance > amount){
            this.setBalance(this.balance - amount);
        }
        else{
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
