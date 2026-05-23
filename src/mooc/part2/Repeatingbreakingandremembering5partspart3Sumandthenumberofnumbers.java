package mooc.part2;

import java.util.Scanner;
public class Repeatingbreakingandremembering5partspart3Sumandthenumberofnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int sum = 0;
        int count =0;
        while (true){
            int n = Integer.valueOf(input.nextLine());
            if (n==-1){break;}
            sum+=n;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+count);
    }
}
