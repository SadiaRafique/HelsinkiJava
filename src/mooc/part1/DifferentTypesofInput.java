package mooc.part1;

import java.util.Scanner;
public class DifferentTypesofInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = sc.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.valueOf(sc.nextLine());
        System.out.println("Give a double:");
        double number1 = Double.valueOf(sc.nextLine());
        System.out.println("Give a boolean:");
        boolean ok = Boolean.valueOf(sc.nextLine());
        System.out.println("You gave the string "+text);
        System.out.println("You gave the integer "+number);
        System.out.println("You gave the double "+number1);
        System.out.println("You gave the boolean "+ok);
    }
}
