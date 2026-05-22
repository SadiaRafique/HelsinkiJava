package mooc.part2;

import java.util.Scanner;
public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.valueOf(input.nextLine());
        int b = Integer.valueOf(input.nextLine());
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else if(a<b){
            System.out.println(a+" is smaller than "+b);
        }else {
            System.out.println(a+" is equal to "+b);
        }
    }
}
