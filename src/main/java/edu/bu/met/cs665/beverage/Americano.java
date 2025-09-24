/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: Americano.java
 * Description: Represents an Americano beverage.
 */

package edu.bu.met.cs665.beverage;

public class Americano extends Beverage {
    
    public Americano() {
        this.name = "Americano";
        this.price = 3.0;
    }

    /**
     * Overrides getBasePrice method in Beverage class
     */
    @Override
    protected double getBasePrice() {
        return 3.0;
    }
    
}
