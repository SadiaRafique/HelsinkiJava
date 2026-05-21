package mooc.part1;

import java.util.Scanner;
public class Same {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.nextLine();
        System.out.println("Enter the second string:");
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.println("Same");
        }else  {
            System.out.println("Different");
        }
    }
}
