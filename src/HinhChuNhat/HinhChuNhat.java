/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HinhChuNhat;

/**
 *
 * @author Hai
 */
public class HinhChuNhat {
    private float chieudai;
    private float chieurong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float chieudai, float chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public float getChieudai() {
        return chieudai;
    }

    public void setChieudai(float chieudai) {
        this.chieudai = chieudai;
    }

    public float getChieurong() {
        return chieurong;
    }

    public void setChieurong(float chieurong) {
        this.chieurong = chieurong;
    }
    public float Chuvi(){
        return (this.getChieudai()+this.getChieurong())*2;
    }
    public float dienTich(){
        return this.getChieudai()*this.getChieurong();
    }
    @Override
    public String toString(){
        return String.format("%-10.1f%-11.1f%-8.1f%-10.1f",this.getChieudai(),this.getChieurong(),Chuvi(),dienTich());
    }
}
