/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.cse;
import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {elements = new Object[DEFAULT_CAPACITY];}
    public void add(E e) {
        if (size == elements.length) {ensureCapa();}
        elements[size++] = e;
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Bangladesh");list.add("USA");
        String item = list.get(0);
    }
}