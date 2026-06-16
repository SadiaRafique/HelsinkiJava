package mooc.part2;
import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(sca.nextLine());
            if(num==0){
                break;
            }
            if(num<0 || num>0){
                sum=sum+num;
            }
        }
        System.out.println("Sum of numbers is: "+sum);
    }
}
