/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPoint;

import java.util.Arrays;

/**
 *
 * @author Hai
 */
public class testMyCircle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2, 3);
        MyCircle c1 = new MyCircle(p1, 5);
        c1.setCenterX(5);
        System.out.println(c1.getCenterX());
        System.out.println(Arrays.toString(c1.getCenterXY()));
    }
}
