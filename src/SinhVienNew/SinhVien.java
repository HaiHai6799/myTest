/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVienNew;

import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class SinhVien {
    Scanner sc= new Scanner(System.in);
    private int id;
    private String fullname;

    public SinhVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public SinhVien(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }
    public void inputSinhvien() throws Exception{
        boolean bool;
        
        do{
            bool= true;
            try{
            System.out.println("Mời nhập id: ");
            int id=Integer.parseInt(sc.nextLine());
            if(id>0){
            this.setId(id);
            } else {
                bool= false;
            }
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
                bool= false;
            }
        }while (bool!= true);
        do{
            bool= true;
            System.out.println("Mời nhập full name: ");
            String name= sc.nextLine();
            Thaotac.removeSpace(name);
            if(Thaotac.checkFullname(name)== true){
                this.setFullname(name);
            }
            else {
                bool= false;
            }
        }while(bool!= true);
    }
    

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", fullname=" + fullname + '}';
    }
    
}
