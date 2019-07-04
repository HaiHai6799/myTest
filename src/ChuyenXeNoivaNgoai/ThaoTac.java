/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuyenXeNoivaNgoai;

/**
 *
 * @author Hai
 */
public class ThaoTac {
    public static String removeSpace(String s, boolean bool){
        s=s.trim();
        
        if(bool = true){
            return s.replaceAll("\\s+"," ");
        }
        else{
            return s.replaceAll("\\s+", "");
        }
    }
    public static boolean checkMachuyenXe(String s){
        if(s.matches("(\\w{0,9})")){
            return true;
        }else return false;
    }
    public static boolean checkTen(String s){
        if(s.matches("^[a-z A-Z]{3,50}$")){
            return true;
        } else{
            return false;
        }
    }

    
}
