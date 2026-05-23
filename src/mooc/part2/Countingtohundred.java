package mooc.part2;

import java.util.Scanner;
public class Countingtohundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int start = n;
        int end = 100;
        for (int j = start; j<= end; j++) {
            System.out.println(j);
        }
    }
}
