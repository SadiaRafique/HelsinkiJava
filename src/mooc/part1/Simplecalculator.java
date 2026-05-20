package mooc.part1;

import java.util.Scanner;
public class Simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = Integer.valueOf(sc.nextLine());
        System.out.println("Enter the second number:");
        int y = Integer.valueOf(sc.nextLine());
        int sum = x+y;
        int difference = x-y;
        int multiply = x*y;
        double divide =1.0*x/y;
        System.out.println(x+" "+"+"+" "+y+" "+"="+" "+sum);
        System.out.println(x+" "+"-"+" "+y+" "+"="+" "+difference);
        System.out.println(x+" "+"*"+" "+y+" "+"="+multiply);
        System.out.println(x+" "+"/"+" "+y+" "+"="+divide);

    }
}
