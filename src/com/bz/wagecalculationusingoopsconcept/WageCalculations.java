package com.bz.wagecalculationusingoopsconcept;

import java.util.Scanner;
public class WageCalculations {
    static int hoursPerDay = 8;
    void CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(int userInput , int workingDays , int hoursPerMonth, int wagePerHour){
            if (userInput == 1)
                System.out.println("The Monthly Wage of Employee based on total working days=" + wagePerHour * hoursPerDay * workingDays + " Rs");
            else if (userInput == 2)
                System.out.println("The Monthly Wage of Employee based on total working hours=" + wagePerHour * hoursPerMonth + " Rs");
            else
                System.out.println("Invalid Input from User");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for computing in days\nEnter 2 for computing in hour");
        int userInput = sc.nextInt();
        WageCalculations wageForCompany1 = new WageCalculations();          //different  objects for multiple companies
        WageCalculations wageForCompany2 = new WageCalculations();
        WageCalculations wageForCompany3 = new WageCalculations();
        WageCalculations wageForCompany4 = new WageCalculations();
        wageForCompany1.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , 25 , 80, 20);
        wageForCompany2.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , 20 , 100, 25);
        wageForCompany3.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , 22 , 120, 18);
        wageForCompany4.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , 24 , 90, 30);
    }
}