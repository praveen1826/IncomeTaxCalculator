package com.company;

public class CommonCitizen implements AgeStrategy{

    @Override
    public void taxExemption() {
        System.out.println("You are exempt from tax until 250000");
    }
}
