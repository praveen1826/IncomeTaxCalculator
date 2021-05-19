package com.company;

public class SuperSeniorOn2021 extends TaxCalculator{
    public SuperSeniorOn2021(){
        ageStrategy = new SuperSeniorCitizen();
        yearStrategy = new Fy2021();
    }
}
