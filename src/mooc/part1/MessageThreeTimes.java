package mooc.part1;

import java.util.Scanner;
public class MessageThreeTimes {
    public static void main(String[] args) {
        Scanner message= new Scanner(System.in);
        System.out.println("Write a message:");
        String a= message.nextLine();
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);


    }
}
