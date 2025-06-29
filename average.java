// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)


import java.util.*;
public class average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int A = sc.nextInt();
        System.out.println("enter Second number");
        int B = sc.nextInt();
        System.out.println("enter third number");
        int C = sc.nextInt();

        int average_of_number = (A+B+C)/3;

        System.out.println("the average of there number is " + " " + average_of_number);

    }
}