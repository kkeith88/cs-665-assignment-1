/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: YellowTea.java
 * Description: Represents a Yellow Tea beverage.
 */

package edu.bu.met.cs665.beverage;

public class YellowTea extends Beverage {
    
    public YellowTea() {
        this.name = "Yellow Tea";
        this.price = 2.0;
    }
    @Override
    protected double getBasePrice() {
        return 2.0;
    }
    
}
