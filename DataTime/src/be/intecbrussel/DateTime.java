package be.intecbrussel;

import java.time.*;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {

        //oefening 1

        LocalDate currentYear = LocalDate.now();
        System.out.println("The current year is " + currentYear);

        int year = currentYear.getYear();
        boolean leap = false;

        if (year % 4 == 0) {
             if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year and has 366 days");
        else
            System.out.println(year + " is not a leap year and has 365 days");

        //oefening 2

        LocalDate oldDate = LocalDate.of(1975, Month.APRIL, 29);
        LocalDate newDate = LocalDate.of(2022, Month.OCTOBER, 5);

        Period period = Period.between(oldDate, newDate);
        System.out.print("I'm " + period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, ");
        System.out.println(period.getDays() + " days ");

        //oefening 3, deel 1, 2 en 3

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter day that you worked : ");
        String day = myScanner.nextLine();
        System.out.println("Entry time in hours");
        int hoursIn = myScanner.nextInt();
        System.out.println("Entry time in minutes");
        int minutesIn = myScanner.nextInt();
        System.out.println("Departure time in hours");
        int hoursOut = myScanner.nextInt();
        System.out.println("Departure time in minutes");
        int minutesOut = myScanner.nextInt();

            int totalHoursInMin = 0;
            if ((hoursIn <= 24 && minutesIn <= 60) && (hoursOut <= 24 && minutesOut <= 60)) {
                totalHoursInMin = (hoursOut - hoursIn) * 60;
                double totalMinWorked = minutesOut - minutesIn;
                System.out.println("total min worked" +totalMinWorked);
                double totalTimeWorked = (totalMinWorked + totalHoursInMin)/60;
                System.out.println(totalTimeWorked);
                double totalSalary = totalTimeWorked * 11.5;
                switch (day) {
                    case "Monday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Tuesday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Wednesday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Thursday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Friday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Saturday":
                        double salarySaturday = totalSalary * 1.25;
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + salarySaturday + " euros");
                        break;
                    default:
                        double salarySunday = totalSalary * 1.50;
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + salarySunday + " euros");
                        break;
                }

            } else {
                System.out.println("Time not valid");
            }

        }

    }
















