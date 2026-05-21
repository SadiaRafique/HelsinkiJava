package mooc.part1;

import java.util.Scanner;
public class CheckYourIndentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        System.out.print("Enter your number: ");
        int x = Integer.valueOf(sc.nextLine());
        if (x == 10) {
            System.out.println("Your number is equal to 10");
        } else {
            System.out.println("Your number is less than or greater than 10");
        }
    }
}