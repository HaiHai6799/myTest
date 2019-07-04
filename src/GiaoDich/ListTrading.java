/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDich;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hai
 */
public class ListTrading {
    List<GiaoDich> ds;
    public int countGoldtrading=0,countMoneyTrading=0;
    public float totalGoldtrading=0,totalMoneytrading=0;
    public ListTrading(){
        ds= new LinkedList();
    }
    public GiaoDich findTrading(String code){
        code= code.trim();
        for(GiaoDich xx: ds){
            if(xx.getCode().equalsIgnoreCase(code)){
                return xx;
            }
        }
        return null;
    }
    public void addTrading(int temp){
        if(temp == 1){
            GiaoDich x1= new GoldTrading();
            x1.nhap();
            if(ds.contains(x1)){
                System.out.println("Trading had in list.");
            }
            else{
                ds.add(x1);
                System.out.println("Enter success.");
            }
            countGoldtrading++;
            totalGoldtrading += ((GoldTrading)x1).MoneySum();
        }
        else if(temp == 2){
            GiaoDich x2= new MoneyTrading();
            x2.nhap();
            if(ds.contains(x2)){
                System.out.println("Trading had in list.");
            }
            else {
                ds.add(x2);
                System.out.println("Enter success");
            }
            countMoneyTrading++;
            totalMoneytrading += ((MoneyTrading)x2).MoneySum();
        }
    }
    public void OutPut(){
        System.out.println("Has "+countGoldtrading+" golden trading in the list.");
        System.out.println("Has "+countMoneyTrading+" money trading in the list.");
        System.out.println("----------------------------------------------------");
        System.out.println("GOLD TRADING");
        for(GiaoDich xx: ds){
            if(xx instanceof GoldTrading){
                System.out.println(xx);
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("MONEY TRADING");
        for(GiaoDich yy: ds){
            if(yy instanceof MoneyTrading){
                System.out.println(yy);
            }
        }
    }
    public void AverageTotalforMoneyTrading(){
        System.out.println("Average of total money for Money Trading: "+totalMoneytrading/countMoneyTrading);
    }
    public void costHigherOneBillion(){
        System.out.println("----------------------------------------------------");
        System.out.println("OutPut");
        for(GiaoDich xx: ds){
            if(xx.getCost()>1000000000){
                System.out.println(xx);
            }
        }
    }
    public void sortIncreasingByCost(){
        Collections.sort(ds, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                if(o1.getCost()> o2.getCost())
                    return 1;
                else if(o1.getCost()< o2.getCost())
                    return -1;
                else return 0;
            }
        });
        for(GiaoDich xx: ds){
            System.out.println(xx);
        }
    }
    public int menu(){
        Scanner sc= new Scanner (System.in);
        int n;
        System.out.println("1.Add Golden trading");
        System.out.println("2.Add Money Traidng");
        System.out.println("3.Output list");
        System.out.println("4.Amount for each trading");
        System.out.println("5.Average total for Money Trading");
        System.out.println("6.Output trading's cost are higher than 1 billion");
        System.out.println("7.Arrange");
        System.out.println("0.Exit");
        System.out.println("Please select: ");
        n= Integer.parseInt(sc.nextLine());
        return n;
    }
    public static void main(String[] args) {
        int chon;
        ListTrading DS = new ListTrading();
        do{
            chon= DS.menu();
            switch(chon){
                case 1: DS.addTrading(1);
                    break;
                case 2: DS.addTrading(2);
                    break;
                case 3: DS.OutPut();
                    break;
                case 4:
                    break;
                case 5: DS.AverageTotalforMoneyTrading();
                    break;
                case 6: DS.costHigherOneBillion();
                    break;
                case 7: DS.sortIncreasingByCost();
                    break;
                default: break;
            }
        }while(chon!=0);
    }
}
