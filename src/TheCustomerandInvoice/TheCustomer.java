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
public class TheCustomer {
    private int id;
    private String name;
    private int discount;

    public TheCustomer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.id + ")";
    }
    
}
