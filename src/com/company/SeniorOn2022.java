package com.company;

public class SeniorOn2022 extends TaxCalculator {
    public SeniorOn2022(){
        ageStrategy = new SeniorCitizen();
        taxStrategy = new Fy2022();
    }
}
