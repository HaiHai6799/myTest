/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPoint;

/**
 *
 * @author Hai
 */
public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        int arr[] = {this.getCenterX(),this.getCenterY()};
        return arr;
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius= " + this.radius + ",center=(" + this.center.getX() + "," + this.center.getY() + ")]";
    }
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}
