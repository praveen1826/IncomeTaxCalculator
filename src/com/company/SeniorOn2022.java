package com.company;

public class SeniorOn2022 extends TaxCalculator {
    public SeniorOn2022(){
        ageStrategy = new SeniorCitizen();
        yearStrategy = new Fy2022();
    }
}
