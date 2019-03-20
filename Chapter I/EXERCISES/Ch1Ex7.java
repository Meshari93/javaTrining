package EXERCISES;

/**
 * (Approximate p) p can be computed using the following formula:
 * p = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 * 
 * Write a program that displays the result of
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * and
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
 * Use 1.0 instead of 1 in your program.
 */ 
    public class Ch1Ex7 {
    public static void main(String[] args) {

        System.out.println("The resut of 4 * 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11  : ");
        System.out.println((1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 ));
        System.out.println("------------------");
        double p = 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13;
        System.out.println("The resut of 4 * 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11  : ");
        System.out.println(p);
    }
}