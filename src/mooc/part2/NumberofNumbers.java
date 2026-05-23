package mooc.part2;

import java.util.Scanner;
public class NumberofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("Give a number:");
           int n =Integer.valueOf( sc.nextInt());
            if(n==0){
                break;
            }
            if(n<0 || n>0){
                num = num + 1;
            }
        }
        System.out.println("Number of Numbers: "+num);
    }
}
