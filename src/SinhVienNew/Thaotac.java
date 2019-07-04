/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVienNew;

/**
 *
 * @author Hai
 */
public class Thaotac {
    public static String removeSpace(String s){
        //xóa tất cả dấu cách đầu và cuối câu.
        s=s.trim();
        s=s.replaceAll("\\s+", " ");
        return s;
    }
    /*  public static void standardized(SinhVien sv) throws Exception{
    try{
    sv.setFullname(removeSpace(sv.getFullname()));
    sv.setId(removeSpace(sv.getId()));
    }catch(Exception e){
    throw e;
    }
    }*/
    /*public static boolean checkID(String s) throws Exception{
    try{
    if(s.matches("^[a-zA-Z](\\w{0,9})$")){
    return true;
    }
    else return false;
    }catch(Exception e){
    throw e;
    }
    }*/
    public static boolean checkFullname(String s) throws Exception{
        try{
            if(s.matches("^[a-z A-Z]{5,40}$")){
                return true;
            }
            else return false;
        }catch(Exception e){
            throw e;
        }
    }
    /*public static boolean checkAll(SinhVien sv) throws Exception{
    try{
    if(checkID(sv.getId())== true && checkFullname(sv.getFullname())==true)
    return true;
    else
    return false;
    }catch(Exception e){
    throw e;
    }
    }*/
    
}
