/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.cse;

/**
 *
 * @author mohsin
 */
public class Student {
    private String id;
    private String name;
    private double cgpa;

    public Student() {
    }

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public Student(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        
        this.cgpa = cgpa;
    }
    
    public void incCGPA(double inc) {
        this.cgpa+=inc;
    }
    
    public void subCGPA(double dec) {
        this.cgpa-=dec;
    }
    
 
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Student s1 = new Student();
        s1.setId("2022-1-60-124");
        s1.setName("Xman");
        s1.setCgpa(3.99);
        
        String sid = s1.getId();
        String sname = s1.getName();
        double scgpa = s1.getCgpa();
        
        System.out.println("id = "+sid+" name= "+sname+" cgpa= "+scgpa);
        
        Student s2 = new Student("2022-1-60-111", "Yman", 3.76);
        
        System.out.println("id = "+s2.getId()+" name= "+s2.getName()+" cgpa= "+s2.getCgpa());
        
        s2.setCgpa(3.77);
        
        System.out.println("id = "+s2.getId()+" name= "+s2.getName()+" cgpa= "+s2.getCgpa());
        
        
        
        
    }
    
    
    
}
