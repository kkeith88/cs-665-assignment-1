/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: Main.java
 * Description: Write a description for this class
 */
 
package edu.bu.met.cs665.beverage;

public class GreenTea extends Beverage {
    
    public GreenTea() {
        this.name = "Green Tea";
        this.price = 2.0;
    }
    @Override
    protected double getBasePrice() {
        return 2.0;
    }
    
}
