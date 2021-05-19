package com.company;

public class Fy2022 implements YearStrategy {

    @Override
    public void calculateTax() {
        System.out.println("No Extra Taxes");
    }
}
