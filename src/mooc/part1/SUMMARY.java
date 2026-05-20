package mooc.part1;

import java.util.Scanner;
public class SUMMARY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something:");
        String text = sc.nextLine();
        int number = Integer.valueOf(sc.nextLine());
        double number1 = Double.valueOf(sc.nextLine());
        boolean ok = Boolean.valueOf(sc.nextLine());
        System.out.println(text+" " + number +" "  +number1+" " + ok);
    }
}
