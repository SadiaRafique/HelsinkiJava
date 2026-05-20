package mooc.part1;

import java.util.Scanner;
public class Double_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number:");
        double value = Double.valueOf(sc.nextLine());
        System.out.println("You gave the number "+value);
    }
}
