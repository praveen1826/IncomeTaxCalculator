package com.company;

public class SuperSeniorCitizen implements AgeStrategy{
    @Override
    public void taxExemption() {
        System.out.println("Tax Exemption Increased To 5,00,000");
    }
}
