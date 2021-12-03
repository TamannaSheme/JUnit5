
package com.ewu.cse;

public class ComplexNumber {
    private int real;
    private int imag;
    public ComplexNumber(int real, int imag) {
        this.real = real; 
        this.imag = imag;
    }
    public int getReal() { return real; }
    public int getImag() { return imag; }
    public void setReal(int real) { this.real = real; }
    public void setImag(int imag) { this.imag = imag; }
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real+c2.real;
        temp.imag = c1.imag+c2.imag;
        return temp;
    }
    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real-c2.real;
        temp.imag = c1.imag-c2.imag;
        return temp;
    }
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, 10);
        ComplexNumber c2 = new ComplexNumber(15, 4);
        ComplexNumber sum = add (c1,c2);
        System.out.println(" "+sum.real+"+ i "+sum.imag);
    }
}