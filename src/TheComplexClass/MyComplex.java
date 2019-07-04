/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheComplexClass;

/**
 *
 * @author Hai
 */
public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    
    public void setValue(double real, double imag){
        this.setReal(real);
        this.setImag(imag);
    }

    @Override
    public String toString() {
        return "MyComplex=(" + this.real + "+" + this.imag + "i)"  ;
    }
    public boolean isReal(){
        return (this.imag == 0);
    }
    public boolean isImaginary(){
        return (this.real == 0);
    }
    public boolean equals(double real, double imag){
        return (this.real == real && this.imag == imag);
    }
    public boolean equals(MyComplex another){
        return (this.real == another.real && this.imag == another.imag);
    }
    public double magnitude(){
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
    }
    public double argument(){
        return Math.atan2(this.imag, this.real);
    }
    public MyComplex add(MyComplex right){
        this.setReal(this.real + right.real);
        this.setImag(this.imag + right.imag);
        return this;
    }
    public MyComplex addNew(MyComplex right){
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.real + right.real);
        newComplex.setImag(this.imag + right.imag);
        return newComplex;
    }
    public MyComplex subtract(MyComplex right){
        this.setReal(this.real + right.real);
        this.setImag(this.imag + right.imag);
        return this;
    }
    public MyComplex subtractNew(MyComplex right){
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.real - right.real);
        newComplex.setImag(this.imag - right.imag);
        return newComplex;
    }
    public MyComplex multiply(MyComplex right){
        this.setReal(this.real*right.real - this.imag*right.imag);
        this.setImag(this.real * right.imag + this.imag*right.real);
        return this;
    }
    public MyComplex conjugate(){
        this.setImag(-this.imag);
        return this;
    }
}
