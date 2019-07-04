/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NganHang;

/**
 *
 * @author Hai
 */
public class DanhsachTaikhoan {
    Taikhoan[] tk;
    public int count=0;
    public DanhsachTaikhoan(int spt){
        tk= new Taikhoan[spt];
    }
    public void mangtangKichthuoc(){
        Taikhoan[] temp= new Taikhoan[tk.length*2];
        for(int i=0;i<tk.length;i++){
            temp[i]= tk[i];
            tk= temp;
        }
    }
    public int tim(long stk){
        for(int i=0;i<count;i++){
            if(tk[i].getSotaikhoan()== stk){
                return i;
            }
        } return -1;
    }
    public boolean themAcc(Taikhoan xx){
        if(tim(xx.getSotaikhoan())!=-1)
            return false;
        if(tk.length== count){
            mangtangKichthuoc();
        }
        tk[count]= xx;
        count++;
        return true;
    }
    public void xoa(long stk){
        int vt= tim(stk);
        if(vt!=-1){
            for(int i=vt;i<count-1;i++)
                tk[i]= tk[i+1];
        }
        count--;
    }
    public Taikhoan getOne(int i){
        return tk[i];
    }
    public Taikhoan[] getAll(){
        return tk;
    }
}
