/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuyenXeNoivaNgoai;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class DanhSach {
    Scanner sc= new Scanner(System.in);
    List<ChuyenXe> dscx;
    public int countCXNoiThanh=0,countCXNgoaiThanh=0;
    public float sumNgT=0,sumNT=0;
    public DanhSach(){
        dscx= new LinkedList<>();
    }
    public ChuyenXe timCX(String ma){
        for(ChuyenXe cx: dscx){
            if(cx.getMasochuyen().equalsIgnoreCase(ma)){
                return cx;
            }
        }
        return null;
    }
    public void themCX(int tam){
        try{
        if(tam==1){
            CXNoiThanh NT= new CXNoiThanh();
            NT.nhap();
            if(dscx.contains(NT)){
                System.out.println("Chuyen xe da ton tai trong danh sach.");
                System.out.println("Nhap khong thanh cong");
            } else{
                dscx.add(NT);
                System.out.println("Nhap thanh cong.");
            }
            sumNT+= NT.getDoanhthu();
            countCXNoiThanh++;
        }
        else if(tam==2){
            CXNgoaiThanh NgoaiThanh = new CXNgoaiThanh();
            NgoaiThanh.nhap();
            if(dscx.contains(NgoaiThanh)){
                System.out.println("Chuyen xe da ton tai trong danh sach");
                System.out.println("Nhap khong thanh cong");
            }else {
                dscx.add(NgoaiThanh);
                System.out.println("Nhap thanh cong");
            }
            sumNgT+= NgoaiThanh.getDoanhthu();
            countCXNgoaiThanh++;
        }
    }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Nhap khong thanh cong");
    }
    }
    public void xoaCX(){
        boolean bool;
        do{
            bool= true;            
            try{
                System.out.println("Moi nhap ma chuyen xe ma ban muon thuc hien xoa: ");
                String ma= sc.nextLine();
                ThaoTac.removeSpace(ma, false);
                if(ThaoTac.checkMachuyenXe(ma)== true && timCX(ma)!= null){
                    ChuyenXe xx= timCX(ma);
                    dscx.remove(xx);
                    System.out.println("Xoa thanh cong");
                } else{
                    System.out.println("Khong tim thay chuyen xe trong danh sach");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                bool= false;
            }
        }while(bool != true);
        System.out.println("Danh sach chuyen xe sau khi xoa: ");
        System.out.println("---------------------------------");
        xuatThongtincacCX();
    }
    public void xuatThongtincacCX(){
        
        for(ChuyenXe cx: dscx){
            if(cx instanceof CXNoiThanh){
                System.out.println("Chuyen xe Noi thanh: ");
                System.out.println("Co "+countCXNoiThanh+" chuyen xe Noi thanh trong Danh sach");
                System.out.println(cx);
            }
            else if(cx instanceof CXNgoaiThanh){
                System.out.println("Chuyen xe Ngoai Thanh: ");
                System.out.println("Co "+countCXNgoaiThanh+" chuyen xe Noi thanh trong Danh sach");
                System.out.println(cx);
            }
        }
    }
    public void DoanhThuTungloaixe(){
        System.out.println("Doanh thu CX Noi Thanh: "+sumNT);
        System.out.println("Doanh thu CX Ngoai Thanh: "+sumNgT);
    }
    public int menu(){
        int n;
        System.out.println("1.Them chuyen xe Noi Thanh");
        System.out.println("2.Them chuyen xe Ngoai Thanh");
        System.out.println("3.Hien thi danh sach cac chuyen xe");
        System.out.println("4.In doanh thu tung loai xe");
        System.out.println("5.Xoa chuyen xe theo ma Chuyen xe");
        System.out.println("6.Sắp xếp danh sách theo mã chuyến xe");
        System.out.println("0.Thoat menu");
        System.out.println("Moi ban chon: ");
        n= Integer.parseInt(sc.nextLine());
        return n;
    }
    public void test(){
        Collections.sort(dscx, new Comparator<ChuyenXe>(){
            @Override
            public int compare(ChuyenXe o1, ChuyenXe o2) {
                return o1.getMasochuyen().compareToIgnoreCase(o2.getMasochuyen());
            }
        
    });
        for(ChuyenXe cx: dscx){
            System.out.println(cx);
        }
    }
    public static void main(String[] args) {
        int chon;
        DanhSach ds= new DanhSach();
        do{
            chon= ds.menu();
            switch(chon){
                case 1: ds.themCX(1);
                    break;
                case 2: ds.themCX(2);
                break;
                case 3: ds.xuatThongtincacCX();
                    break;
                case 4: ds.DoanhThuTungloaixe();
                break;
                case 5: ds.xoaCX();
                break;
                case 6: ds.test();
                    break;
                default: break;
            }
        }while(chon != 0);
    }
}
