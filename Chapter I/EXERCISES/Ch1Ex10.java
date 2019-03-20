package EXERCISES;

/**
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and
 * 30 seconds. Write a program that displays the average speed in miles per
 * hour. (Note that 1 mile is 1.6 kilometers.) Created By : Meshari Jabbar
 */

 public class Ch1Ex10 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double mile = kilometers / 1.6;

        double reat = (45.5 * 60.0 + 30.0)/ (60.0 * 60.0);

        double averagePerHour = mile / reat;

        System.out.println("The average speed in miles per hour is : " + averagePerHour);



    }
 }