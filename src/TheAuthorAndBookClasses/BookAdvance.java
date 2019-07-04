/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheAuthorAndBookClasses;

import java.util.Arrays;

/**
 *
 * @author Hai
 */
public class BookAdvance {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public BookAdvance(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookAdvance(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "BookAdvance{" + "name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + '}';
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
