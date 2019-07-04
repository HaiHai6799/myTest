/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVienObject;


import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author Hai
 */
public class Danhsach {
    Scanner sc= new Scanner(System.in);
    SinhVien[] sv;
    public int count=0;
    public Danhsach(int spt){
        sv= new SinhVien[spt];
    }
    public void mangtangKT(){
        SinhVien[] temp= new SinhVien[sv.length*2];
        for(int i=0;i<sv.length;i++){
            temp[i]= sv[i];
            sv= temp;
        }
    }
    public int timSV(int masv){
        for(int i=0;i<count;i++){
            if(sv[i].getMasv()== masv){
                return i;
            }
        }
        return -1;
    }
    public boolean them() throws Exception{
        SinhVien xx= new SinhVien();
        xx.nhap();
        if(timSV(xx.getMasv())!=-1){
            System.out.println("Đã tồn tại sinh viên.");
            return false;
        }
        if(sv.length== count)
            mangtangKT();
        sv[count]=xx;
        count++;
        return true;
    }
    public void hienthiThongtin(){
        for(int i=0;i<count;i++){
            System.out.println(sv[i]);
        }
    }
    public SinhVien getOne(int i){
        return sv[i];
    }
    public SinhVien[] getAll(){
        return sv;
    }
    public void xoa(int masv){
        int vt= timSV(masv);
        if(vt!=-1){
            for(int i=vt;i<count-1;i++)
                sv[i]= sv[i+1];
        }
        count--;
    }
    public static void main(String[] args) {
        Danhsach ds= new Danhsach(10);
        int chon = 0;
        boolean bool= true;
        do{
            try{
                System.out.println("Bạn có muốn nhập sinh viên");
                System.out.println("1.Có");
                System.out.println("2.Không");
                System.out.println("Mời chọn: ");
                chon= Integer.parseInt(ds.sc.nextLine());
                switch(chon){
                    case 1: if(ds.them()== true){
                        System.out.println("Nhập thành công.");
                    } else System.out.println("Nhập không thành công");
                        break;
                    case 2: System.out.println("Cảm ơn bạn đã nhập thông tin");
                        break;
                    default: 
                        break;
                }
               
            }catch(NumberFormatException e){
                System.out.println("Error: "+e.getMessage());
                System.out.println("Nhập không thành công");
                bool= false;
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
                System.out.println("Nhập không thành công");
                bool= false;
            }
        }while(bool!= true || chon!=2);
        System.out.println("Danh sách sau khi sắp xếp: ");
        Arrays.sort(ds.getAll(),0,ds.count);
        ds.hienthiThongtin();
    }
}
