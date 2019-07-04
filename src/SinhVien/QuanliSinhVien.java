/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class QuanliSinhVien {
    Scanner sc= new Scanner(System.in);
    public String tieuDe(){
        return String.format("%-6s%-15s%-10s%-10s%-11s", "Ma SV","Ho ten","Diem LT","Diem TH","Trung binh");
    }
    public SinhVien nhap() throws Exception{
        System.out.println("Nhap ma sinh vien: " );
        int ma= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ho va ten sinh vien: ");
        String ten= sc.nextLine();
        System.out.println("Nhap diem li thuyet: ");
        float diemlt= Float.parseFloat(sc.nextLine());
        System.out.println("Nhap diem thuc hanh: ");
        float diemth= Float.parseFloat(sc.nextLine());
        return new SinhVien(ma, ten, diemlt, diemth);
    }
    public static void main(String[] args) throws Exception {
        QuanliSinhVien ql= new QuanliSinhVien();
        SinhVien sv1 = null;
        boolean bool;
        do{
        try{
            sv1= new SinhVien();
        sv1= ql.nhap();
        bool= true;
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            bool= false;
        }
        }while(bool!= true);
        System.out.println(ql.tieuDe());
        System.out.println(sv1);
    }
}
