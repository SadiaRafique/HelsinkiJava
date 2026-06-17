package mooc.part2;

import java.util.Scanner;
public class Averageofpositivenumbers {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int cp = 0;
        int sum=0;
        while(true){
            int n = Integer.valueOf(sca.nextLine());
            if(n==0){
                break;
            }
            if(n>0){
                sum+=n;
                cp++;
            }
        }
        if (cp==0){
            System.out.println("Cannot calculate average.");
        }else {
            System.out.println(1.0 * sum / cp);
        }
    }
}
