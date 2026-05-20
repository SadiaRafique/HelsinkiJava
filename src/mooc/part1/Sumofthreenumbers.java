package mooc.part1;

import java.util.Scanner;
public class Sumofthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(sc.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(sc.nextLine());
        int sum = first + second + third;
        System.out.println("The sum of the numbers is "+sum);
    }
}
