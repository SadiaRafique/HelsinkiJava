package mooc.part1;

import  java.util.Scanner;
public interface Checkingtheage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(input.nextLine());
        if (age >=0 && age <= 120) {
            System.out.println("OK");
        }

        if ((age < 0) || (age > 120)) {
            System.out.println("Impossible!");
        }
    }
}
