package mooc.part2;

import java.util.Scanner;
public class Arewethereyet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(sc.nextLine());
            if(n==4){
                break;
            }
        }
    }
}
