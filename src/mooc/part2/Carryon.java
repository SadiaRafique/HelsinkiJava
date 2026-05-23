package mooc.part2;

import java.util.Scanner;
public class Carryon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Shall we carry on?");
            String a=input.nextLine();
            if(a.equals("no")){
                break;
            }
        }
    }
}
