/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author moogi
 */
public class Triangle extends Shape {
    // Here is the easy way by using class 
    private int side1;
    private int side2;
    private int side3;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        if (side1 > 0) {
            this.side1 = side1;
        } else {
            System.out.println("Cannot set side1 of a triange to be non-positive");
        }
        
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
}
