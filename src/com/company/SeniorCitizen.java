package com.company;

public class SeniorCitizen implements AgeStrategy{

    @Override
    public double taxExemption(double taxxxx) {
        if(taxxxx <= 300000){
            System.out.println("Exempt From Tax Until 300000");
            double FinalTax= 0;
            System.out.println("Your Final Tax Is:    "+FinalTax);
            return FinalTax;
        }return taxxxx;
    }
}
