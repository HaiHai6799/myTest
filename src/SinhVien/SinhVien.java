/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author Hai
 */
public class SinhVien {
    private int masv;
    private String hoten;
    private float diemLT,diemTH;

    public SinhVien() {
    }

    public SinhVien(int masv, String hoten, float diemLT, float diemTH) throws Exception {
        this.setMasv(masv);
        this.setHoten(hoten);
        this.setDiemLT(diemLT);
        this.setDiemTH(diemTH);
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) throws Exception{
        if(masv>0)
        this.masv = masv;
        else throw new Exception("Loi nhap ma sinh vien");
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) throws Exception{
        if(hoten.length()>0)
        this.hoten = hoten;
        else throw new Exception("Loi nhap ho ten sinh vien");
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) throws Exception{
        if(diemLT>0)
        this.diemLT = diemLT;
        else throw new Exception("Loi nhap diem li thuyet");
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) throws Exception{
        if(diemTH>0)
        this.diemTH = diemTH;
        else throw new Exception("Loi nhap diem thuc hanh");
    }
    public float trungbinh(){
        return (this.getDiemLT()+ this.getDiemTH())/2;
    }
    @Override
    public String toString(){
        return String.format("%-6d%-15s%-10.1f%-10.1f%-11.1f",this.getMasv(),this.getHoten(),this.getDiemLT(),this.getDiemTH(),trungbinh());
    }
    }
