/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTimeClass;

/**
 *
 * @author Hai
 */
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
            if(hour > 0 && hour <24 && minute > 0 && minute < 59 && second > 0 && second < 59){
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            }
            else{
                throw new IllegalArgumentException("Invalid hour, minute, or second.");
            }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "MyTime=(" + this.hour + ":" + this.minute + ":" + this.second + ")";
    }
    
    
}
