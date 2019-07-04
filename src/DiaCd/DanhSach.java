/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiaCd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class DanhSach {
    DiaCD[] cd;
    
    Scanner sc= new Scanner (System.in);
    public int count=0;
    public DanhSach(int spt){
        cd= new DiaCD[spt];
    }
    public void mangtangKT(){
        DiaCD[] temp= new DiaCD[cd.length*2];
        for(int i=0;i<cd.length;i++){
            temp[i]=cd[i];
            cd=temp;
        }
    }
    public int timvtCD(int macd){
        for(int i=0;i<count;i++)
        {
            if(cd[i].getMacd()== macd){
                return i;
            }
        }
        return -1;
    }
    public boolean them() throws Exception{
        DiaCD xx= new DiaCD();
        xx.nhap();
        if(cd.length== count){
            mangtangKT();
        }
        if(timvtCD(xx.getMacd())!=-1){
            return false;
        }
        cd[count]=xx;
        count++;
        return true;
    }
    public void SoluongCD(){
        System.out.println("So luong CD co trong danh sach: "+count);
    }
    public float tongGiathanhcacCD(){
        float sum= 0;
        for(int i=0;i<count;i++){
            sum+= cd[i].getGiathanh();
        }
        return sum;
    }
    public void xuatThongtin(){
        for(int i=0;i<count;i++){
            System.out.println(cd[i]);
        }
    }
    public void sapxepgiamdanTheogia(){
        ArrayList al= new ArrayList<>();
        for(int i=0;i<count;i++){
            al.add(cd[i]);
        }
        Collections.sort(al, new Comparator<DiaCD>() {
            @Override
            public int compare(DiaCD o1, DiaCD o2) {
                if(o1.getGiathanh()<o2.getGiathanh())
                    return 1;
                else if(o1.getGiathanh()>o2.getGiathanh())
                    return -1;
                else return 0;
            }
            });
        for(Object cd:al){ // chú ý cái chỗ này phải khai báo Class Object
            System.out.println(cd);
        }
}
    public void sapxepTangdantheoTuaCD(){
        ArrayList al= new ArrayList<>();
        for(int i=0;i<count;i++){
            al.add(cd[i]);
        }
        Collections.sort(al, new Comparator<DiaCD>(){
            @Override
            public int compare(DiaCD o1, DiaCD o2) {
                return o1.getTuaCD().compareToIgnoreCase(o2.getTuaCD());
            }
            
        });
        for(Object cd: al){
        System.out.println(cd);
    }
        
    }
    public DiaCD[] getAll(){
        return cd;
    }
    public int menu(){
        int n;
        System.out.println("1.Nhập");
        System.out.println("2.Xuất");
        System.out.println("3.Danh sách sau khi sắp xếp theo giá");
        System.out.println("4.Danh sách sau khi sắp xếp theo tua CD");
        System.out.println("Mời bạn chọn: ");
        n= Integer.parseInt(sc.nextLine());
        return n;
    }
    public static void main(String[] args) throws Exception {
        int chon = 0;
        DanhSach ds= new DanhSach(10);
        boolean bool = true;
        do{
            try{
            chon= ds.menu();
            switch(chon){
                case 1: if(ds.them()== true)
                        System.out.println("Nhập thành công");
                else System.out.println("Nhập không thành công");
                    break;
                case 2: ds.xuatThongtin();
                    break;
                case 3: ds.sapxepgiamdanTheogia();
                break;
                case 4: ds.sapxepTangdantheoTuaCD();
                break;
                case 5:ds.SoluongCD();
                break;
                default: break;
            }
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
                System.out.println("Nhập không thành công.");
                bool= false;
            }
        }while (bool!= true || chon!=0);
    }
}
