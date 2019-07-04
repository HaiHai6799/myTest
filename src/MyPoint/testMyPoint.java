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
public class testMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        
        MyPoint points[] = new MyPoint[10];
        for(int i =0; i< points.length;i++){
            points[i] = new MyPoint(i+1,i+1);
            System.out.println(points[i].toString());
        }
    }
}
