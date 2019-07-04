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
public class testTheCustomerandInvoice {
    public static void main(String[] args) {
        double a = 5.25555;
        TheCustomer c1 = new TheCustomer(1, "Hai", 15);
        System.out.println(c1);
        Invoice i1= new Invoice(5, c1, 5000);
        System.out.println(i1.getCustomerName());
        System.out.println(i1.getAmountAfterDiscount());
        
        Account a1 = new Account(15, c1, 5.512131556);
        // nạp tiền
        System.out.println(a1.deposit(1.0).toString());
        // rút tiền
        System.out.println(a1.withdraw(500));
    }
}
