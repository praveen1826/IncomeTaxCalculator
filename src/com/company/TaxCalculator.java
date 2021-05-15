package com.company;

public class TaxCalculator{
    TaxStrategy taxStrategy;
    AgeStrategy ageStrategy;

    public TaxCalculator(){

    }

    public void commonTax(){
        System.out.println("This calculation is common for all Years And Ages");
    }

    public void tax(){
        ageStrategy.taxExemption();
        taxStrategy.calculateTax();
    }

}