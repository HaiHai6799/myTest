/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheMyPolynomialClass;

/**
 *
 * @author Hai
 */
public class MyPolynomial {
    public double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return this.coeffs.length-1;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = this.coeffs.length; i>=0; i--){
            sb.append(coeffs[i] + (i != 0 ? "*x^" + i + " + " : ""));
        }
        return sb.toString();
    }
    public double evaluate(double x){
        
    }
}
