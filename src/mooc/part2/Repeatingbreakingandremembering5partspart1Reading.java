package mooc.part2;

import java.util.Scanner;
public class Repeatingbreakingandremembering5partspart1Reading {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Give a number: ");
        while(true){
            int n = Integer.valueOf(sc.nextLine());
            if (n==-1){break;}
        }
        System.out.println("Thx! Bye!");
    }
}
