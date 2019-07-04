/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circle;

/**
 *
 * @author Hai
 */
public class testCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of:"+c1.getRadius() + " and area of " + c1.getArea());
        
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        
        Circle c3 = new Circle(3.0,"yellow");
        System.out.println("The circle has radius of " + c3.getRadius() + " and the color of circle is: " + c3.getColor());
        
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        c4.setColor("black");
        System.out.println(c4.getRadius() + " " + c4.getColor());
        System.out.println(c4.toString());
    }
}
