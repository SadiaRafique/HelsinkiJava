package mooc.part2;

import java.util.Scanner;
public class Fromwheretowhere2partspart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Where to? ");
        int x = Integer.valueOf(sc.nextLine());
        System.out.println("Where from? ");
        int y = Integer.valueOf(sc.nextLine());
        for (int j = y; j<= x; j++) {
            System.out.println(j);
        }
    }
}
