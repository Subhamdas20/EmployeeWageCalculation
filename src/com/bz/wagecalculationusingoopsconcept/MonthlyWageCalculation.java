package com.bz.wagecalculationusingoopsconcept;

import java.util.Scanner;

public class MonthlyWageCalculation {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int hoursPerDay = 8;
        int hoursPartTime = hoursPerDay/2;
        int daysPerMonth = 20;
        System.out.println("The Monthly Wage Full Time of Employee = " + wagePerHour*hoursPerDay*daysPerMonth + " Rs");
        System.out.println("The Monthly Wage of Part Time Employee = " + wagePerHour*hoursPartTime*daysPerMonth + " Rs");
    }
}