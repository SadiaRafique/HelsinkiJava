package mooc.part2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Squarerootofsum {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int x = Integer.valueOf(input.nextLine());
            int y = Integer.valueOf(input.nextLine());
            int z = x+y;
            if (z<0){
                System.out.println("Error!");
            }else {
                System.out.println((double)( Math.sqrt(z)) );
            }
    }
}
