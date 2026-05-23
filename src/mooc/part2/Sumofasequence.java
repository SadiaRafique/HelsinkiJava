package mooc.part2;

import java.util.Scanner;
public class Sumofasequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Last Number? ");
        int n = Integer.valueOf(sc.nextLine());
        int sum = 0;
        int i;
        for ( i = 1; i<= n;i++ ){
            sum += i;
        }
        System.out.println("The sum is "+sum);
    }
}
