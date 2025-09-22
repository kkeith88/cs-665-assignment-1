/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: BlackTea.java
 * Description: Represents a Black Tea beverage.
 */

package edu.bu.met.cs665.beverage;

public class BlackTea extends Beverage {
    
    public BlackTea() {
        this.name = "Black Tea";
        this.price = 2.0;
    }
    @Override
    protected double getBasePrice() {
        return 2.0;
    }
    
}
