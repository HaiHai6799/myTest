/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuyenXeNoivaNgoai;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class ChuyenXe {
    Scanner sc= new Scanner(System.in);
    private String masochuyen;
    private String tentaixe;
    private String soxe;
    private float doanhthu;

    public ChuyenXe() {
    }

    public String getMasochuyen() {
        return masochuyen;
    }

    public void setMasochuyen(String masochuyen) {
        this.masochuyen = masochuyen;
    }

    public String getTentaixe() {
        return tentaixe;
    }

    public void setTentaixe(String tentaixe) {
        this.tentaixe = tentaixe;
    }

    public String getSoxe() {
        return soxe;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }

    public ChuyenXe(String masochuyen, String tentaixe, String soxe, float doanhthu) {
        this.masochuyen = masochuyen;
        this.tentaixe = tentaixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }
    public void nhap(){
        boolean bool;
        do{
            bool= true;
            try{
                System.out.println("Nhap ma chuyen xe: ");
                String ma= sc.nextLine();
                ThaoTac.removeSpace(ma,false);
                if(ThaoTac.checkMachuyenXe(ma)== true){
                    this.setMasochuyen(ma);
                }
                else {
                    bool= false;
                }
            }catch(NullPointerException e){
                System.out.println(e.getMessage());
                bool= false;
            }
            catch(Exception e){
                System.out.println("Error: "+e.getMessage());
                bool=false;
            }
        }while(bool!= true);
        
        do{
            bool= true;
            try{
                System.out.println("Nhap ten tai xe: ");
                String ten= sc.nextLine();
                ThaoTac.removeSpace(ten, true);
                if(ThaoTac.checkTen(ten)== true){
                    this.setTentaixe(ten);
                } else {
                    bool= false;
                }
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
                bool = false;
            }
        }while(bool != true);
        
        do{
           bool= true;
           try{
               System.out.println("Nhap so xe: ");
               String soxe= sc.nextLine();
               ThaoTac.removeSpace(soxe, false);
               if(soxe.length()>0){
                   this.setSoxe(soxe);
               } else{
                   bool= false;
               }
           }catch(Exception e){
               System.out.println(e.getMessage());
               bool= false;
           }
        }while(bool != true);
        
        do{
            bool= true;
            try{
                System.out.println("Nhap doanh thu: ");
                float doanhthu= Float.parseFloat(sc.nextLine());
                if(doanhthu>0){
                    this.setDoanhthu(doanhthu);
                } else{
                    bool= false;
                }
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
                bool=false;
            }catch(Exception e){
                System.out.println(e.getMessage());
                bool= false;
            }
        }while(bool != true);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.masochuyen);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChuyenXe other = (ChuyenXe) obj;
        if (!Objects.equals(this.masochuyen, other.masochuyen)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" + "masochuyen=" + masochuyen + ", tentaixe=" + tentaixe + ", soxe=" + soxe + ", doanhthu=" + doanhthu + '}';
    }
    
}
class CXNoiThanh extends ChuyenXe{
    private int sotuyenxe;
    private double sokm;

    public CXNoiThanh() {
    }

    public int getSotuyenxe() {
        return sotuyenxe;
    }

    public void setSotuyenxe(int sotuyenxe) {
        this.sotuyenxe = sotuyenxe;
    }

    public double getSokm() {
        return sokm;
    }

    public void setSokm(double sokm) {
        this.sokm = sokm;
    }

    public CXNoiThanh(String masochuyen, String tentaixe, String soxe, float doanhthu,int sotuyenxe, double sokm) {
        super(masochuyen, tentaixe, soxe, doanhthu);
        this.sotuyenxe = sotuyenxe;
        this.sokm = sokm;
    }
    @Override
    public void nhap(){
        boolean bool;
        super.nhap();
        
        do{
            bool= true;
            try{
                System.out.println("Nhap so tuyen xe: ");
                int sotuyen= Integer.parseInt(sc.nextLine());
                if(sotuyen>0){
                    this.setSotuyenxe(sotuyen);
                }else {
                    bool = false;
                }
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
                bool= false;
            }
        }while(bool != true);
        
        do{
            bool= true;
            try{
                System.out.println("Nhap so kilomet: ");
                double sokilomet= Double.parseDouble(sc.nextLine());
                if(sokilomet>0){
                    this.setSokm(sokilomet);
                }else {
                    bool = false;
                }
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
                bool= false;
            }
        }while(bool != true);
    }

    @Override
    public String toString() {
        return "CXNoiThanh{"+super.toString() + "sotuyenxe=" + sotuyenxe + ", sokm=" + sokm + '}';
    }
}
class CXNgoaiThanh extends ChuyenXe{
    private String noiden;
    private int songay;

    public CXNgoaiThanh() {
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    public CXNgoaiThanh( String masochuyen, String tentaixe, String soxe, float doanhthu,String noiden, int songay) {
        super(masochuyen, tentaixe, soxe, doanhthu);
        this.noiden = noiden;
        this.songay = songay;
    }
    @Override
    public void nhap(){
        boolean bool;
        super.nhap();
        
        do{
            bool= true;
            try{
                System.out.println("Nhap noi den: ");
                String noixeden= sc.nextLine();
                if(noixeden.length()>0){
                    this.setNoiden(noixeden);
                }else {
                    bool = false;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                bool= false;
            }
        }while(bool != true);
        
        do{
            bool= true;
            try{
                System.out.println("Nhap so ngay di: ");
                int songaydi= Integer.parseInt(sc.nextLine());
                if(songaydi>0){
                    this.setSongay(songaydi);
                }else {
                    bool = false;
                }
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
                bool= false;
            }
        }while(bool != true);
    }

    @Override
    public String toString() {
        return "CXNgoaiThanh{"+super.toString() + "noiden=" + noiden + ", songay=" + songay + '}';
    }
    
}
