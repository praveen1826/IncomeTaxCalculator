package com.company;

import java.util.Scanner;

public class TaxCalculator{
    TaxStrategy taxStrategy;
    AgeStrategy ageStrategy;

    public TaxCalculator(){

    }

    public void commonTax(){
        System.out.println("This calculation is common for all Years And Ages");
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
                switch(chooser1){
                    case 1:
                        TaxCalculator commonOn2021 = new CommonOn2021();
                        commonOn2021.commonTax();
                        commonOn2021.tax();
                      break;
                    case 2:
                        TaxCalculator seniorOn2021 = new SeniorOn2021();
                        seniorOn2021.commonTax();
                        seniorOn2021.tax();
                      break;
                    case 3:
                        TaxCalculator superSeniorOn2021 = new SuperSeniorOn2021();
                        superSeniorOn2021.commonTax();
                        superSeniorOn2021.tax();
                      break;
                }
            case 2:
                switch (chooser1){
                    case 1:
                        TaxCalculator commonOn2022 = new CommonOn2022();
                        commonOn2022.commonTax();
                        commonOn2022.tax();
                      break;
                    case 2:
                        TaxCalculator seniorOn2022 = new SeniorOn2022();
                        seniorOn2022.commonTax();
                        seniorOn2022.tax();
                        break;
                    case 3:
                        TaxCalculator superSeniorOn2022 = new SuperSeniorOn2022();
                        superSeniorOn2022.commonTax();
                        superSeniorOn2022.tax();
                        break;
                }



        }
        System.out.println("Enter The Annual Salary:");
        int salary = details.nextInt();
    }
    public void tax(){
        ageStrategy.taxExemption();
        taxStrategy.calculateTax();
    }

}