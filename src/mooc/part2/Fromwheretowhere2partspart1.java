package mooc.part2;

import java.util.Scanner;
public class Fromwheretowhere2partspart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where to?");
        int n = Integer.valueOf(sc.nextLine());
        int start = 1;
        int end = n;
        for (int j = start; j<= end; j++) {
            System.out.println(j);
        }
    }
}
