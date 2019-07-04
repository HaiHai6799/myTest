/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NganHang;

import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class QuanliTaiKhoan {
    Scanner sc= new Scanner(System.in);
    
    public void hienThi(int spt,Taikhoan[] tk){
        for(int i=0;i<spt;i++){
            System.out.println(tk[i]);
        }
    }
    public int menu(){
        int t;
        System.out.println("1.Nhập");
        System.out.println("2.Hiển thị");
        System.out.println("3.Xóa");
        System.out.println("0.Thoát");
        System.out.println("Mời bạn chọn: ");
        t= Integer.parseInt(sc.nextLine());
        return t;
    }
    public static void main(String[] args) {
        int chon = 0;
        int n;
        boolean bool= true;
        QuanliTaiKhoan ql= new QuanliTaiKhoan();
        DanhsachTaikhoan ds= new DanhsachTaikhoan(10);
        
        do{
            try{
            chon= ql.menu();
            switch(chon){
                case 1: 
                    
                    System.out.println("Mời nhập sô tài khoản muốn nhập: ");
                n= Integer.parseInt(ql.sc.nextLine());
                for(int i=0;i<n;i++){
                    System.out.println("Nhập tài khoản thứ "+(i+1)+": ");
                    Taikhoan xx= new Taikhoan();
                    xx.nhap();
                    if(ds.themAcc(xx)== true)
                        System.out.println("Thêm tài khoản thành công.");
                    else if(ds.themAcc(xx)== false) System.out.println("Tài khoản đã tồn tại");
                }
                    break;
                case 2: ql.hienThi(ds.count,ds.getAll());
                    break;
                case 3: 
                    break;
                default: break;
            }
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
                bool= false;
                System.out.println("Mời chọn chức năng để nhập lại");
            }
        }while(chon!=0 || bool!= true);
    }
    
}
