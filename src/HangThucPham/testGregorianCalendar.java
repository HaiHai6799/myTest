/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangThucPham;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Hai
 */
public class testGregorianCalendar {
    public static void main(String[] args) throws ParseException {
        String months[] = {
      "1", "Feb", "Mar", "Apr",
      "May", "Jun", "Jul", "Aug",
      "9", "Oct", "Nov", "Dec"};
        String s1= "2/9/2018";
        String s2= "2/10/2018";
        GregorianCalendar ngay1 = new GregorianCalendar();
        GregorianCalendar ngay2 = new GregorianCalendar();
        SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy");
        ngay1.setTime(sf.parse(s1));
        ngay2.setTime(sf.parse(s2));
        System.out.println(ngay1.before(ngay2));
        String s= months[ngay1.get(Calendar.MONTH)];
        System.out.println(s);
        int nam= ngay1.get(Calendar.YEAR);
    }
}
