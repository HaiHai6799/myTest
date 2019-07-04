/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangThucPham;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class HangThucPham implements Comparable<HangThucPham>{
    Scanner sc= new Scanner(System.in);
    private String mahang; // bieen instance
    private String tenhang;
    private double dongia;
    private GregorianCalendar ngaysanxuat;
    private GregorianCalendar ngayhethan;

    public HangThucPham() {
    }

    public String getMahang() {
        return mahang;
    }


    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) throws Exception{
        if(dongia>0)
        this.dongia = dongia;
        else throw new Exception("Lỗi nhập đơn giá.");
    }

    public GregorianCalendar getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(GregorianCalendar ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public GregorianCalendar getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(GregorianCalendar ngayhethan) throws Exception{
        if(ngayhethan.after(this.ngaysanxuat)== true)
        this.ngayhethan = ngayhethan;
        else throw new Exception ("Lỗi nhập ngày.");
    }
    public GregorianCalendar nhapNgay(String ngay) throws ParseException{
        GregorianCalendar ngayGre= new GregorianCalendar();
        SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy");
        ngayGre.setTime(sf.parse(ngay));
        return ngayGre;
    }

    public HangThucPham(String mahang, String tenhang, double dongia, GregorianCalendar ngaysanxuat, GregorianCalendar ngayhethan) {
        this.mahang = mahang; 
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.ngaysanxuat = ngaysanxuat;
        this.ngayhethan = ngayhethan;
        // từ khóa this dùng đẻ phân biệt biến instance và biến cục bộ
    }
    
    public void nhap() throws Exception{
        System.out.println("Mời nhập mã hàng: ");
        mahang= sc.nextLine();
        System.out.println("Mời nhập tên hàng: ");
        tenhang= sc.nextLine();
        System.out.println("Mời nhập đơn giá");
        dongia= Double.parseDouble(sc.nextLine());
        this.setDongia(dongia);
        System.out.println("Mời nhập ngày sản xuất: ");
        String ngaysx= sc.nextLine();
        ngaysanxuat= nhapNgay(ngaysx);
        System.out.println("Mời nhập ngày hết hạn: ");
        String ngayhh= sc.nextLine();
        ngayhethan= nhapNgay(ngayhh);
        this.setNgayhethan(ngayhethan);
    }
    public HangThucPham(String mahang) {
        this.mahang = mahang;
    }

    @Override
    public String toString() {
        Locale locale= new Locale("vi", "vn");
        NumberFormat nf= NumberFormat.getCurrencyInstance(locale);
        SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy");
        return "HangThucPham{" + ", mahang=" + mahang + ", tenhang=" + tenhang + ", dongia=" + nf.format(dongia) + ", ngaysanxuat=" + sf.format(ngaysanxuat.getTime()) + ", ngayhethan=" + sf.format(ngayhethan.getTime()) + '}';
    }

    @Override
    public int compareTo(HangThucPham o) {
        return this.getTenhang().compareToIgnoreCase(o.getTenhang());
    }
    
}
