package mooc.part2;

import java.util.Scanner;
public class Reprint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many times?");
        int c =0;
        int n = Integer.valueOf(input.nextLine());
        while(true) {
            if (c == n) break;
            c++;
            printtext();
        }
    }
    public static void printtext(){
        System.out.println("In a hole in the ground there lived a method");
    }
}

