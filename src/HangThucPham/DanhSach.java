/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangThucPham;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class DanhSach {

    Scanner sc = new Scanner(System.in);
    HangThucPham[] htp;
    public int count = 0;

    public DanhSach(int spt) {
        htp = new HangThucPham[spt];
    }

    public void mangtangKichthuoc() {
        HangThucPham[] temp = new HangThucPham[htp.length * 2];
        for (int i = 0; i < htp.length; i++) {
            temp[i] = htp[i];
            htp = temp;
        }
    }

    public int tim(String ma) {
        for (int i = 0; i < count; i++) {
            if (htp[i].getMahang().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    public boolean them() throws Exception {
        HangThucPham xx = new HangThucPham();
        xx.nhap();
        if (tim(xx.getMahang()) != -1) {
            return false;
        }
        if (htp.length == count) {
            mangtangKichthuoc();
        }
        htp[count] = xx;
        System.out.println(count);
        count++;
        return true;
    }
    public void suathongtinSanpham() throws Exception{
        
        HangThucPham suaTP;
        int chon;
        System.out.println("Moi nhap ma hang hoa muon sua doi thong tin: ");
        String ma= sc.nextLine();
        int vt= tim(ma);
        if(vt!=-1){
            suaTP= getOne(vt);
            do{
            System.out.println("1.Sua ten san pham: ");
            System.out.println("2.Sua don gia san pham");
            System.out.println("3.Sua ngay san xuat");
            System.out.println("4.Sua ngay het han");
            System.out.println("0.Thoat");
            System.out.println("Moi ban chon: ");
            chon= Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1: System.out.println("Moi nhap lai ten san pham: ");
                String tensp= sc.nextLine();
                suaTP.setTenhang(tensp);
                break;
                case 2: System.out.println("Moi nhap lai don gia san pham: ");
                double dongia= Double.parseDouble(sc.nextLine());
                suaTP.setDongia(dongia);
                break;
                case 3: System.out.println("Moi nhap lai ngay san xuat: ");
                String ngay1= sc.nextLine();
                GregorianCalendar ngaysx= suaTP.nhapNgay(ngay1);
                suaTP.setNgaysanxuat(ngaysx);
                break;
                case 4: System.out.println("Moi nhap lai ngay het han: ");
                String ngay2= sc.nextLine();
                GregorianCalendar ngayhh= suaTP.nhapNgay(ngay2);
                suaTP.setNgayhethan(ngayhh);
                break;
                default: break;
            }
            } while(chon!=0);
            htp[vt]= suaTP;
        } else System.out.println("Khong tim thay san pham.");
        System.out.println("Thong tin san pham sau khi sua: ");
        System.out.println(htp[vt]);
    }

    public void hienThidanhsach() {
        for (int i = 0; i < count; i++) {
            System.out.println(htp[i]);
        }
    }
    public void sapxepDanhsachtheoTen(){
        Arrays.sort(htp,0,count);
        hienThidanhsach();
    }
    public void xuatraThucphamthang9nam2018(){
        String[] month={
            "1","2","3","4","5","6","7","8","9","10","11","12"
        };
        for(int i=0;i<count;i++){
            if(month[htp[i].getNgaysanxuat().get(Calendar.MONTH)].equalsIgnoreCase("9") && (htp[i].getNgaysanxuat().get(Calendar.YEAR))==2018)
                System.out.println(htp[i]);
        }
    }
    public HangThucPham getOne(int i) {
        return htp[i];
    }

    public HangThucPham[] getAll() {
        return htp;
    }
    
    public static void main(String[] args) throws Exception {
        DanhSach ds = new DanhSach(10);
        boolean bool = true;
        do {
            try {
                System.out.println("Mời bạn nhập số mặt hàng muốn nhập: ");
                int n = Integer.parseInt(ds.sc.nextLine());
                for (int i = 0; i < n; i++) {
                    System.out.println("Mời nhập mặt hàng thứ " + (i + 1) + ": ");
                    if (ds.them() == true) {
                        System.out.println("Nhập thành công");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
                System.out.println("Nhập không thành công");
                bool = false;
            }
        } while (bool != true);
        ds.sapxepDanhsachtheoTen();
        System.out.println("----------------------");
        System.out.println("Danh sachs thuc pham cua thang 9 nam 2018 la:");
        ds.xuatraThucphamthang9nam2018();
        System.out.println("Sua thong tin san pham: ");
        ds.suathongtinSanpham();
        
    }
}
