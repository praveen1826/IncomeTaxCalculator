package com.company;

import java.util.Scanner;

public class TaxCalculator{
    YearStrategy yearStrategy;
    AgeStrategy ageStrategy;

    public TaxCalculator(){

    }

    public double commonTax(){
        double TotalTax = 0;
        System.out.println("Enter The Annual Salary:     ");
        Scanner sal = new Scanner(System.in);
        double AnnualSalary = sal.nextDouble();
        if(AnnualSalary<=250000){
            TotalTax=0;
        }
        else if(AnnualSalary>250000 && AnnualSalary<=500000){
            TotalTax=AnnualSalary*0.1;
        }
        else if(AnnualSalary>500000 && AnnualSalary<=1000000){
            TotalTax=AnnualSalary*0.15;
        }
        else if(AnnualSalary>1000000){
            TotalTax=AnnualSalary*0.30;
        }
        System.out.println("Your Common Tax is:"+TotalTax);
        return AnnualSalary;
    }
    public void getDetails(){
        Scanner details = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("    1.For Year 2021     ");
        System.out.println("    2.For Year 2022     ");
        System.out.println("============================");
        System.out.println("Enter The Year:");
        int chooser = details.nextInt();
        System.out.println("=========================================");
        System.out.println("    1.Normal Citizen(under 60yrs)   ");
        System.out.println("    2.Senior Citizen(60 to 80yrs)   ");
        System.out.println("    3.Super Senior Citizen(above 80yrs)");
        System.out.println("=========================================");
        System.out.println("Enter Your Age Group:");
        int chooser1 = details.nextInt();
        switch(chooser) {
            case 1:
                switch (chooser1) {
                    case 1 -> {
                        TaxCalculator commonOn2021 = new CommonOn2021();
                        commonOn2021.commonTax();
                        commonOn2021.tax();
                    }
                    case 2 -> {
                        TaxCalculator seniorOn2021 = new SeniorOn2021();
                        seniorOn2021.commonTax();
                        seniorOn2021.tax();
                    }
                    case 3 -> {
                        TaxCalculator superSeniorOn2021 = new SuperSeniorOn2021();
                        superSeniorOn2021.commonTax();
                        superSeniorOn2021.tax();
                    }
                }
               break;
            case 2:
                switch (chooser1) {
                    case 1 -> {
                        TaxCalculator commonOn2022 = new CommonOn2022();
                        commonOn2022.commonTax();
                        commonOn2022.tax();
                    }
                    case 2 -> {
                        TaxCalculator seniorOn2022 = new SeniorOn2022();
                        seniorOn2022.commonTax();
                        seniorOn2022.tax();
                    }
                    case 3 -> {
                        TaxCalculator superSeniorOn2022 = new SuperSeniorOn2022();
                        superSeniorOn2022.commonTax();
                        superSeniorOn2022.tax();
                    }
                }
               break;



        }
    }
    public void tax(){
        double AnnualSalary = commonTax();
        yearStrategy.calculateTax();
        double FinalTax= ageStrategy.taxExemption(AnnualSalary);
        if(FinalTax<AnnualSalary){
            ageStrategy.taxExemption(AnnualSalary);
        }
        else{
            commonTax();
        }
    }
}