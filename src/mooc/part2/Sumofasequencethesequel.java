package mooc.part2;

import java.util.Scanner;
public class Sumofasequencethesequel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number? ");
        int x = Integer.valueOf(sc.nextLine());
        System.out.println("Last Number? ");
        int y = Integer.valueOf(sc.nextLine());
        int sum = 0;
        for (int j = x; j<= y; j++) {
            sum += j;
        }
        System.out.println("The sum is "+sum);
    }
}
