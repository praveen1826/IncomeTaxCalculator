package com.company;

public class SeniorOn2021 extends TaxCalculator {
    public SeniorOn2021(){
        ageStrategy = new SeniorCitizen();
        yearStrategy = new Fy2021();
    }


}
