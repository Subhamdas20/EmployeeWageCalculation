package com.bz.wagecalculationusingoopsconcept;

import java.util.Scanner;

public class PartTimeWageCalculationUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Full Time Wage Calculation\nEnter 2 for Part Time Wage Calculation");
        int userInput = sc.nextInt();
        int wageperhour = 20;
        int hoursperday = 8;
        int hoursparttime = hoursperday/2;
        switch(userInput)
        {
            case 1:System.out.println("The Daily Wage of Employee = " + wageperhour * hoursperday + " Rs");
                break;
            case 2 :System.out.println("The Daily Wage of Part Time Employee = " + wageperhour * hoursparttime + " Rs");
                break;
            default : System.out.println("Invalid Input From user");
        }
    }
}