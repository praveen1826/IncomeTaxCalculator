package com.company;

public class SeniorOn2021 extends TaxCalculator {
    public SeniorOn2021(){
        ageStrategy = new SeniorCitizen();
        taxStrategy = new Fy2021();
    }
}
