/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NganHang;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class Taikhoan {
    Scanner sc= new Scanner(System.in);
    private long sotaikhoan;
    private String tentaikhoan;
    private double sotientrongtaikhoan;
    public final double LS=0.035;
    public final double tienphi=20000;
    
    public Taikhoan() {
    }
    public Taikhoan(long sotaikhoan, String tentaikhoan) {
        this.sotaikhoan = sotaikhoan;
        this.tentaikhoan = tentaikhoan;
    }

    public long getSotaikhoan() {
        return sotaikhoan;
    }

    public void setSotaikhoan(long sotaikhoan) throws Exception{
        if(sotaikhoan>0)
        this.sotaikhoan = sotaikhoan;
        else throw new Exception("Lỗi nhập số tài khoản.");
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) throws Exception{
        if(tentaikhoan.length()>0)
        this.tentaikhoan = tentaikhoan;
        else throw new Exception("Lỗi nhập tên tài khoản");
    }

    public double getSotientrongtaikhoan() {
        return sotientrongtaikhoan;
    }

    public void setSotientrongtaikhoan(double sotientrongtaikhoan) throws Exception{
        if(sotientrongtaikhoan>0)
        this.sotientrongtaikhoan = sotientrongtaikhoan;
        else throw new Exception("Lỗi nhập tiền");
    }

    public Taikhoan(long sotaikhoan, String tentaikhoan, double sotientrongtaikhoan) throws Exception {
        this.setSotaikhoan(sotaikhoan);
        this.setTentaikhoan(tentaikhoan);
        this.setSotientrongtaikhoan(sotientrongtaikhoan);
    }
    public boolean tienNhap(double sotiennhap){
        if(sotiennhap>0)
            return true;
        else return false;
    }
    public void napTien(double sotiennap) throws Exception{
        double s= this.getSotientrongtaikhoan();
        double tienmuonnap;
        do{
        System.out.println("Mời nhập số tiền muốn nạp: ");
        tienmuonnap= Double.parseDouble(sc.nextLine());
        }while(tienNhap(tienmuonnap)!= true);
        this.setSotientrongtaikhoan(s+sotiennap);
        System.out.println("Nạp tiền thành công.");
        
    }
    public void rutTien(double sotienrut) throws Exception{
        double tienmuonrut;
        double s= this.getSotientrongtaikhoan();
        do{
        System.out.println("Mời nhập số tiền muốn rút: ");
        tienmuonrut= Double.parseDouble(sc.nextLine());
        if(tienmuonrut>=s)
                System.out.println("Số tiền muốn rút không hợp lệ");
        } while(tienNhap(sotienrut)!= true && tienmuonrut>s);
            this.setSotientrongtaikhoan(s-(sotienrut+tienphi));
            System.out.println("Rút tiền thành công");
    }
    public void chuyenKhoan(Taikhoan xx,double sotienchuyen) throws Exception{
        this.rutTien(sotienchuyen);
        xx.napTien(sotienchuyen);
    }
    public Taikhoan nhap() throws Exception{
        System.out.println("Moi nhap so tai khoan: ");
        sotaikhoan= Long.parseLong(sc.nextLine());
        System.out.println("Moi nhap tên tài khoản: ");
        tentaikhoan= sc.nextLine();
        System.out.println("Mời nhập số tiền trong tai khoản: ");
        sotientrongtaikhoan= Double.parseDouble(sc.nextLine());
        return new Taikhoan(sotaikhoan, tentaikhoan,sotientrongtaikhoan);
    }
    @Override
    public String toString() {
        Locale locale= new Locale("vi", "vn");
        NumberFormat nf= NumberFormat.getCurrencyInstance(locale);
        return "Taikhoan{" + "sotaikhoan=" + sotaikhoan + ", tentaikhoan=" + tentaikhoan + ", sotientrongtaikhoan=" + nf.format(sotientrongtaikhoan) + '}';
    }
}
