package com.company;

public class Fy2021 implements YearStrategy {
    @Override
    public void calculateTax() {
        System.out.println("Pay Extra 5000 Tax For covid19 Fund");
    }
}

