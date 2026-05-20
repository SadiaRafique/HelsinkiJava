package mooc.part1;

import java.util.Scanner;
public class Additionformula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = sc.nextInt();
        System.out.println("Enter the second number:");
        int second = sc.nextInt();
        int sum = first + second;
        System.out.println(first+"+"+second+"="+sum);
    }
}
