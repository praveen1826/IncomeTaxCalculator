package com.company;

public class SuperSeniorOn2022 extends TaxCalculator{
    public SuperSeniorOn2022(){
        ageStrategy = new SuperSeniorCitizen();
        taxStrategy = new Fy2022();
    }
}
