/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class ListBook {
    List<Book> listbook;
    public int countStandardBook=0,countReferenceBook=0;
    public float sumStandard=0,sumReference=0,sumCostforReferenceBook=0;
    public ListBook(){
        listbook= new LinkedList();
    }
    public Book find(String bookcode){
        for(Book b: listbook){
            if(b.getBook_code().equalsIgnoreCase(bookcode))
                return b;
        }
        return null;
    }
    public void addBook(int select){
        if(select == 1){
            Book b1= new StandardBook();
            b1.nhap();
            if(listbook.contains(b1)){
                System.out.println("This book was inputted in list.");
                System.out.println("Enter not success.");
            }else{
                listbook.add(b1);
                System.out.println("Enter success.");
            }
            countStandardBook++;
            sumStandard += ((StandardBook)b1).getMoneySum();
        }
        if(select == 2){
            ReferenceBook b2= new ReferenceBook();
            b2.nhap();
            if(listbook.contains(b2)){
                System.out.println("This book was inputted in list.");
                System.out.println("Enter not success.");
            }else{
                listbook.add(b2);
                System.out.println("Enter success.");
            }
            countReferenceBook++;
            sumReference += b2.getMoneySum();
            sumCostforReferenceBook+= b2.getCost();
        }
    }
    public void Output(){
        System.out.println("StandardBook: ");
        System.out.println("Have "+countStandardBook+" in list.");
        for(Book b: listbook){
            if(b instanceof StandardBook){
                System.out.println(b);
            }
        }
        System.out.println("ReferenceBook: ");
        System.out.println("Have "+countReferenceBook+" in list.");
        for(Book b: listbook){
            if(b instanceof ReferenceBook){
                System.out.println(b);
            }
        }
    }
    public void sumMoneyforEach(){
        System.out.println("Sumary Money for StandardBook: "+ sumStandard);
        System.out.println("Sumary Money for Reference Book: "+sumReference);
    }
    public float averageCostforReferenceBook(){
        return sumCostforReferenceBook/countReferenceBook;
    }
    public void referenceBookofAuthor(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter author's name: ");
        String s=sc.nextLine();
        for(Book b: listbook){
            if((b instanceof ReferenceBook) && b.getProducer().equalsIgnoreCase(s)){
                System.out.println(b.toString());
            }
        }
    }
}
