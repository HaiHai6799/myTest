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
public class testAuthor {
    public static void main(String[] args) {
        Author Hai = new Author("HaiNguyenVan","hainguyenvan6799@gmail.com",'m');
        System.out.println(Hai);
        Hai.setEmail("hainguyenvan67@gmail.com");
        System.out.println(Hai.getEmail());
        System.out.println(Hai.getName());
        System.out.println(Hai.getGender());
    }
}
