package mooc.part1;

import  java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Password?");
        String password = input.nextLine();
        if (password.equals("Caput Draconis")){
            System.out.println("Welcome!");
        }else {
            System.out.println("Off with you!");
        }
    }
}
