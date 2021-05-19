package com.company;

public class SuperSeniorCitizen implements AgeStrategy{

    @Override
    public double taxExemption(double taxxxx) {
        if(taxxxx <= 500000){
            System.out.println("Exempt From Tax Until 500000");
            double FinalTax= 0;
            System.out.println("Your Final Tax Is:    "+FinalTax);
            return FinalTax;
        }return taxxxx;
    }
}
