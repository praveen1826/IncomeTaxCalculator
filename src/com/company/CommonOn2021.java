package com.company;

public class CommonOn2021 extends TaxCalculator{
    public CommonOn2021(){
        ageStrategy = new CommonCitizen();
        yearStrategy = new Fy2021();
    }

}
