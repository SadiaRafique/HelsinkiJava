package mooc.part2;

import java.util.Scanner;
public class Repeatingbreakingandremembering5partspart2Sumofnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int sum = 0;
        while(true){
            int n = Integer.valueOf(input.nextLine());
            if(n==-1){break;}
            sum += n;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
    }
}