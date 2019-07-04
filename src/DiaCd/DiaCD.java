/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiaCd;

import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class DiaCD{
    Scanner sc= new Scanner(System.in);
    private int macd;
    private String tuaCD;
    private String casy;
    private int sobaihat;
    private float giathanh;

    public DiaCD() {
    }

    public int getMacd() {
        return macd;
    }

    public void setMacd(int macd) throws Exception{
        if(macd>0)
        this.macd = macd;
        else throw new Exception("Lỗi nhập mã CD");
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) throws Exception{
        if(tuaCD.length()>0)
        this.tuaCD = tuaCD;
        else throw new Exception("Lỗi nhập tựa CD");
    }

    public String getCasy() {
        return casy;
    }

    public void setCasy(String casy) throws Exception{
        if(casy.length()>0)
        this.casy = casy;
        else throw new Exception("Lỗi nhập tên ca sỹ");
    }

    public int getSobaihat() {
        return sobaihat;
    }

    public void setSobaihat(int sobaihat) throws Exception{
        if(sobaihat>0)
        this.sobaihat = sobaihat;
        else throw new Exception("Lỗi nhập số bài hát");
    }

    public float getGiathanh() {
        return giathanh;
    }

    public void setGiathanh(float giathanh) throws Exception{
        if(giathanh>0)
        this.giathanh = giathanh;
        else throw new Exception("Lỗi nhập giá thành");
    }

    public DiaCD(int macd, String tuaCD, String casy, int sobaihat, float giathanh) {
        this.macd = macd;
        this.tuaCD = tuaCD;
        this.casy = casy;
        this.sobaihat = sobaihat;
        this.giathanh = giathanh;
    }
    public void nhap() throws Exception{
        System.out.println("Mời nhập mã CD: ");
        this.setMacd(Integer.parseInt(sc.nextLine()));
        System.out.println("Mời nhập tựa CD: ");
        this.setTuaCD(sc.nextLine());
        System.out.println("Mời nhập tên ca sỹ: ");
        this.setCasy(sc.nextLine());
        System.out.println("Mời nhập số bài hát: ");
        this.setSobaihat(Integer.parseInt(sc.nextLine()));
        System.out.println("Mời nhập giá của CD: ");
        this.setGiathanh(Float.parseFloat(sc.nextLine()));
    }

    @Override
    public String toString() {
        return "DiaCD{" + "macd=" + macd + ", tuaCD=" + tuaCD + ", casy=" + casy + ", sobaihat=" + sobaihat + ", giathanh=" + giathanh + '}';
    }
    
}