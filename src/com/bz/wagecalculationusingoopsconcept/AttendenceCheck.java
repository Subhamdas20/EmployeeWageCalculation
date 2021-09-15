package com.bz.wagecalculationusingoopsconcept;

public class AttendenceCheck {
    public static void main(String[] args) {
            int attendance = (int) (Math.random()+0.5);
            if ( attendance== 1)
                System.out.println("Employee is Absent");

            else
                System.out.println("Employee is Present");
    }
}
