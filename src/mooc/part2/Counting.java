package mooc.part2;

import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int start = 0;
        int end = n;
        for (int i=start; i<=end; i++){
            System.out.println(i);
        }
        if(n<0) {
            for (int j= start; j>= end; j--) {
                System.out.println(j);
            }
        }
    }
}
