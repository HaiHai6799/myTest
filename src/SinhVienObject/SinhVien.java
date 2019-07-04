/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVienObject;

import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class SinhVien implements Comparable<SinhVien>{
    Scanner sc= new Scanner(System.in);
    private int masv;
    private String ten;
    private String diachi;
    private long sdt;

    public SinhVien() {
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) throws Exception{
        if(masv>0)
        this.masv = masv;
        else throw new Exception("Lỗi nhập mã sinh viên");
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) throws Exception{
        if(ten.length()>0)
        this.ten = ten;
        else throw new Exception("Lỗi nhập tên sinh viên");
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) throws Exception{
        if(diachi.length()>0)
        this.diachi = diachi;
        else throw new Exception("Lỗi nhập địa chỉ");
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) throws Exception{
        int s=(Long.toString(sdt)).length();
        if(s>0 && s<=7)
        this.sdt = sdt;
        else throw new Exception("Lỗi nhập số điện thoại");
    }

    public SinhVien(int masv, String ten, String diachi, long sdt) {
        this.masv = masv;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public void nhap() throws Exception{
        System.out.println("Mời nhập mã sinh viên: ");
        this.setMasv(Integer.parseInt(sc.nextLine()));
        System.out.println("Mời nhập tên sinh viên: ");
        this.setTen(sc.nextLine());
        System.out.println("Mời nhập địa chỉ nhà: ");
        this.setDiachi(sc.nextLine());
        System.out.println("Mời nhập số điện thoại:");
        this.setSdt(Long.parseLong(sc.nextLine()));
    }
    @Override
    public String toString() {
        return "SinhVien{" + "masv=" + masv + ", ten=" + ten + ", diachi=" + diachi + ", sdt=" + sdt + '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.getMasv()>o.getMasv())
            return 1;
        else if(this.getMasv()<o.getMasv())
            return -1;
        else return 0;
    }
    
}
