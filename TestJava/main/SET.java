/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.cse;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
public class SET<Key extends Comparable<Key>> implements Iterable<Key> {
    private TreeSet<Key> set;
    public SET() {set = new TreeSet<Key>();}
    public SET(SET<Key> x) {set = new TreeSet<Key>(x.set);}
    public void add(Key key) {
        if (key == null) 
            throw new IllegalArgumentException("called add() with a null key");
        set.add(key);
    }
    public boolean contains(Key key) {
        if (key == null) 
            throw new IllegalArgumentException("called contains() with a null key");
        return set.contains(key);
    }
    public void delete(Key key) {
        if (key == null) 
            throw new IllegalArgumentException("called delete() with a null key");
        set.remove(key);
    }
    public int size() {return set.size();}
    public boolean isEmpty() {return size() == 0;}
    public Iterator<Key> iterator() {return set.iterator();}
    public static void main(String[] args) {
        SET<String> set = new SET<String>();set.add("www.cs.princeton.edu");
    }
}