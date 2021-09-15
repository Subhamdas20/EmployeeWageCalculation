package com.bz.wagecalculationusingoopsconcept;

public class PartTimeWageCalculation {
    public static void main(String[] args) {
        int wageperhour = 20;
        int hoursperday = 8;
        int hoursparttime = hoursperday/2;
        System.out.println("The Daily Wage of Employee = " + wageperhour*hoursperday + " Rs");
        System.out.println("The Daily Wage of Part Time Employee = " + wageperhour*hoursparttime + " Rs");
    }
}
