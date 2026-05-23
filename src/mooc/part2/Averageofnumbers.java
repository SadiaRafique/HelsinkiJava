package mooc.part2;

import java.util.Scanner;
public class Averageofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(sc.nextLine());
            if(n==0){
                break;
            }
            if(n<0 || n>0){
                c=c+1;
                sum=sum+n;
            }
        }
        double avg=(double) sum/c;
        System.out.println("Average of numbers is: "+avg);
    }
}
