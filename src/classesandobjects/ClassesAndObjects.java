/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

/**
 *
 * @author moogi
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Note that this is harder way to doing this
        //Note = array = used to store multiple values in a single variable
        
        Triangle tri1 = new Triangle ();
        Triangle tri2 = new Triangle ();
        Triangle tri3 = new Triangle ();
        Triangle tri4 = new Triangle ();
        Triangle tri5 = new Triangle ();
        Triangle tri6 = new Triangle ();
        
        int[] sideLengths = new int [18];
        // The legnths of tri1's sides will be first, them the legnths of tri2's sides etc
        sideLengths[0] = 5;
        sideLengths[1] = 8;
        sideLengths[2] = 9;
        
        // tri5 (4, 7, 2)
        sideLengths[12] = 4;
        sideLengths[13] = 7;
        sideLengths[14] = 2;
        
        // We want to set the middle side of each triangle to be 3
        sideLengths[1] = 3;
        sideLengths[4] = 3;
        sideLengths[7] = 3;
        sideLengths[10] = 3;
        sideLengths[13] = 3;
        sideLengths[16] = 3;
        
        Person tim = new Person();
        tim.favTriangle = tri5;
       
        //Because of the Rectangle class is in different package you have to import it
        Rectangle rect1 = new Rectangle();
        
        //Here we tried to get getArea and printed it to the console wich is 31.0
        rect1.getArea();
        System.out.println(rect1.getArea());
        //Shape shape1 = new Shape();
        
        System.out.println(rect1.getColour());
        System.out.println(tri1.getColour());
    }
    
}
