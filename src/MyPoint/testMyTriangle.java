/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPoint;

/**
 *
 * @author Hai
 */
public class testMyTriangle {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(2, 3);
        MyPoint v2 = new MyPoint(3, 4);
        MyPoint v3 = new MyPoint(4, 5);
        MyTriangle t1 = new MyTriangle(v1, v2, v3);
        System.out.println(t1.toString());
    }
}
