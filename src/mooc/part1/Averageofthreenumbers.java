package mooc.part1;

import java.util.Scanner;
public class Averageofthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = Integer.valueOf(sc.nextLine());
        System.out.println("Enter the second number:");
        int y = Integer.valueOf(sc.nextLine());
        System.out.println("Enter the third number:");
        int z = Integer.valueOf(sc.nextLine());
        double average = (double)(x+y+z)/3;
        System.out.println("The average is "+average);
    }
}
