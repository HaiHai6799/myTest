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
public class Invoice {
    private int id;
    private TheCustomer customer;
    private double amount;

    public Invoice(int id, TheCustomer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public TheCustomer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(TheCustomer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName(){
        return this.customer.getName();
    }
    public double getAmountAfterDiscount(){
        return this.amount*(1-(this.customer.getDiscount()/100.0));
    }
}
