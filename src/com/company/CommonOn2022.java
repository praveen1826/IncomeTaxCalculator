package com.company;

public class CommonOn2022 extends TaxCalculator{
    public CommonOn2022(){
        ageStrategy = new CommonCitizen();
        yearStrategy = new Fy2022();
    }

}
