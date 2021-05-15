package com.company;

public class SeniorCitizen implements AgeStrategy{
    @Override
    public void taxExemption() {
        System.out.println("Tax Exemption Raised To 3,00,000");
    }
}
