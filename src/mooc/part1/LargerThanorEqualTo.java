package mooc.part1;

import java.util.Scanner;
public class LargerThanorEqualTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = Integer.valueOf(sc.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(sc.nextLine());
        if(a>b){
            System.out.println("Greater number is: "+a);
        }else if(b>a){
            System.out.println("Greater number is: "+b);
        }else {
            System.out.println("The numbers are equal!");
        }
    }
}
