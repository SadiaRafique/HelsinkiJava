package mooc.part2;

import java.util.Scanner;
public class Repeatingbreakingandremembering5partspart5Evenandoddnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int sum = 0;
        int count = 0;
        double avg = 0;
        int e =0;
        int o = 0;
        while(true){
            int n = Integer.valueOf(input.nextLine());
            if(n==-1){break;}
            sum+=n;
            count++;
            avg = 1.0*sum/count;
            if(n%2==0){
                e++;
            }else {
                o++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+count);
        System.out.println("Average: "+avg);
        System.out.println("Even: "+e);
        System.out.println("Odd: "+o);
    }
}
