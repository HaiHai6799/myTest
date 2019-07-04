/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HinhChuNhat;

import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class Kiemnghiem {
    Scanner sc= new Scanner(System.in);
    public String tieude(){
        return String.format("%-10s%-11s%-8s%-10s","Chieu dai","Chieu rong","Chu vi","Dien tich");
    }
    public HinhChuNhat nhap(){
        System.out.println("Nhap chieu dai: ");
        float cd= Float.parseFloat(sc.nextLine());
        System.out.println("Nhap chieu rong: ");
        float cr= Float.parseFloat(sc.nextLine());
        HinhChuNhat hcn= new HinhChuNhat(cd, cr);
        return hcn;
    }
    public static void main(String[] args) {
        Kiemnghiem km= new Kiemnghiem();
            HinhChuNhat hcn;
             hcn=km.nhap();
        System.out.println(km.tieude());
        System.out.println(hcn.toString());
        HinhChuNhat a= new HinhChuNhat(6, 6);
        System.out.println(a.toString());
        HinhChuNhat b= new HinhChuNhat();
        System.out.println(b.toString());
    }
}
