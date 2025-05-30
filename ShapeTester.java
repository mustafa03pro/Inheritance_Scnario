package com.may28.multilevel;

import java.util.Scanner;

public class ShapeTester  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        
        double radius = Double.parseDouble(sc.nextLine());
        double height=Double.parseDouble(sc.nextLine());

       Cylinder c1=new Cylinder(radius,height);
       
       
       System.out.println("Volume =:"+c1.getVolume());
       System.out.println("Area =:"+c1.getArea());
       sc.close();
       

    }
}

class Circle  {
   
     protected double radius;
     public Circle(){
        this.radius=0;
     }
     

    public Circle(double radius) {
        if (radius < 0) {
            System.out.println("Invalid input. Radius and height must be non-negative.");
            System.exit(0);
        }
        
        this.radius = radius;
       
       
    }
    public double getArea() {
        double area;
        area=Math.PI*(radius*radius); 
        return area;
    }
    
}

class Cylinder  extends Circle {
    protected double height;
   
    public Cylinder(){
        this.height=0;
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
         if (height < 0) {
            System.out.println("Invalid input. Radius and height must be non-negative.");
            System.exit(0);
        }
    }

   

    public double getVolume() {
        double volume;
        volume=(getArea()*height);
        return volume;
    }

    
}

