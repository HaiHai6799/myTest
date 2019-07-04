/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;

/**
 *
 * @author Hai
 */
public class testTime {
    public static void main(String[] args) {
        Time t1 = new Time(9,55,52);
        t1.nextSecond();
        System.out.println(t1.toString());
    }
}
