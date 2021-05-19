package com.company;

public class SuperSeniorOn2022 extends TaxCalculator{
    public SuperSeniorOn2022(){
        ageStrategy = new SuperSeniorCitizen();
        yearStrategy = new Fy2022();
    }
}
