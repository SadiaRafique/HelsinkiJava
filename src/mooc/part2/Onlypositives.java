package mooc.part2;

import java.util.Scanner;
public class Onlypositives {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int num=Integer.valueOf(sc.nextLine());
            if(num==0){
                break;
            } else if (num<0) {
                System.out.println("Unsuitable number");
                continue;
            }else {
                System.out.println(num*num);
            }
        }
    }
}
