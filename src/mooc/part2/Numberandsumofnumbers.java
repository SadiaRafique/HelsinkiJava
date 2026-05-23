package mooc.part2;

import java.util.Scanner;
public class Numberandsumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(sc.nextLine());
            if(num==0){
                break;
            }
            if(num>0 || num<0){
                sum+=num;
                c = c +1;
            }
        }
        System.out.println("Number of Numbers: "+c);
        System.out.println("Sum of Numbers: "+sum);
    }
}
