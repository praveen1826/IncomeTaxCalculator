package com.company;

public class Fy2022 implements TaxStrategy{
    @Override
    public void calculateTax(){
        System.out.println("This is your total tax for 2022");
    }
}
