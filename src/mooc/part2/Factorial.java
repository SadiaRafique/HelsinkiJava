package mooc.part2;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n = Integer.valueOf(sc.nextLine());
        int f  = 1;

        for (int i = 1; i <= n; i++) {
            f *=i;
        }
        System.out.println("The factorial is "+f);
    }
}
