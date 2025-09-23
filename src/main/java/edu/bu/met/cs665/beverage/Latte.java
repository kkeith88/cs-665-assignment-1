/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: Latte.java
 * Description: Represents a Latte beverage.
 */

package edu.bu.met.cs665.beverage;

public class Latte extends Beverage {
    
    public Latte() {
        this.name = "Latte";
        this.price = 4.0;
    }
    @Override
    protected double getBasePrice() {
        return 4.0;
    }
    
}
