package mooc.part2;

import java.util.Scanner;
public class Squared {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.valueOf(input.nextLine());
        System.out.println((num*num));
    }
}
