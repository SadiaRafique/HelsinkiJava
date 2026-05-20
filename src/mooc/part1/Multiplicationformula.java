package mooc.part1;

import java.util.Scanner;
public class Multiplicationformula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(sc.nextLine());
        int multiply  = first * second;
        System.out.println(first+" "+"*"+" "+second+" "+"="+" "+multiply);
    }
}
