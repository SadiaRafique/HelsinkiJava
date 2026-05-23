package mooc.part2;

import java.util.Scanner;
public class Numberofnegativenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(sc.nextLine());
            if (n==0){
                break;
            }
            if (n<0){
                num = num + 1;
            }
            if (n>0){}
        }
        System.out.println("Number of negative numbers: "+num);
    }
}
