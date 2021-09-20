package com.bz.wagecalculationusingoopsconcept;

import java.util.ArrayList;
import java.util.Scanner;
public class WageCalculations {
    ArrayList<WageCalculations> wage = new ArrayList<>();
    static int hoursPerDay = 8;
    static int monthlyWage;
    //    static int totalWage;
    public static int CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(int userInput , int workingDays , int hoursPerMonth, int wagePerHour){
        if (userInput == 1) {
            monthlyWage=wagePerHour * hoursPerDay * workingDays;
            System.out.println("The Monthly Wage of Employee based on total working days=" + monthlyWage + " Rs");
        }
        else if (userInput == 2) {
            monthlyWage=wagePerHour * hoursPerMonth;
            System.out.println("The Monthly Wage of Employee based on total working hours=" + monthlyWage + " Rs");
        }
        else{
            System.out.println("Invalid Input from User");}
        return monthlyWage;
    }
    public static   void wageBuilder(){
        int totalWage = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of wage needs to be calculated");
        int companyNumber=sc.nextInt();
        for(int i=1;i<=companyNumber;i++) {
            System.out.println("Enter 1 for computing wage in days or Enter 2 for computing wage in hour for company number "+i);
            int userInput = sc.nextInt();
            System.out.println("Enter number of workingDays");
            int working_Days_Number = sc.nextInt();
            System.out.println("Enter working hours per month");
            int hoursPerMonth = sc.nextInt();
            System.out.println("Enter wage per hour");
            int wagePerHour = sc.nextInt();
            int wage=CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput, working_Days_Number, hoursPerMonth, wagePerHour);
            System.out.println("Wage is"+wage);
            totalWage = totalWage+wage;
        }
        System.out.println("Total wage is "+totalWage);
    }
    public static void main(String[] args) {
        wageBuilder();
    }
}