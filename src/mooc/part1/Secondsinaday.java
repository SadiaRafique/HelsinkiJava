package mooc.part1;

import java.util.Scanner;
public class Secondsinaday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(sc.nextLine());
        int seconds = days * 24 * 60 * 60;
        System.out.println(seconds);
    }
}
