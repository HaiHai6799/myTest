/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheAuthorAndBookClasses;

/**
 *
 * @author Hai
 */
public class NewClass {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "Ahteck@gmail.com", 'm');
        authors[1] = new Author("paul Tan", "Pautan@gmail.com", 'm');
        
        BookAdvance javadummy = new BookAdvance("Java for dummy", authors, 29.95);
        System.out.println(javadummy.toString());
    }
}
