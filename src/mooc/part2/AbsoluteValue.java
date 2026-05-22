package mooc.part2;

import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.valueOf(input.nextLine());
        if(num<0){
            System.out.println((num*-1));
        }else{
            System.out.println(num);
        }
    }
}
