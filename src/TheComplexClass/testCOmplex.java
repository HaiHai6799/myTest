/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheComplexClass;

/**
 *
 * @author Hai
 */
public class testCOmplex {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(2, 3);
        System.out.println(c1);
        System.out.println(c1.isReal());
        System.out.println(c1.isImaginary());
        System.out.println(c1.equals(2, 3));
        MyComplex c2 = new MyComplex(2, 3);
        System.out.println(c1.equals(c2));
        System.out.println(c1.add(c2));
        System.out.println(c1.addNew(c2));
        System.out.println(c1);
    }
}
