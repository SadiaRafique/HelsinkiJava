package mooc.part1;

import java.util.Scanner;
public class Averageoftwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int x = Integer.valueOf(sc.nextLine());
        System.out.println("Give the second number:");
        int y = Integer.valueOf(sc.nextLine());
        double average = (double) (x+y)/2;
        System.out.println("The average is "+average);
    }
}
