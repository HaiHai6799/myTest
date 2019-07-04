                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Hai
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(){
        this.balance = 0;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        return this.balance + amount;
    }
    public int debit(int amount){
        if (amount < this.balance){
            return this.balance - amount;
        }
        else{
            System.out.println("Amount exceeded balance");
            return this.balance;
        }
    }
    public int transferTo(Account another, int amount){
            if(amount < this.balance){
                return another.balance + amount;
            }
            else{
                System.out.println("Amount exceeded balance.");
                return this.balance;
            }
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
}
