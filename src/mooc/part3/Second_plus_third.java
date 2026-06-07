package mooc.part3;

import java.util.Scanner;
import java.util.ArrayList;
public class Second_plus_third {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(sc.nextLine());
            if (num == 0) {
                break;
            } else {
                list.add(num);
            }
        }
        if (list.size()>=2) {
            System.out.println((list.get(1) + list.get(2)));
        }else{
            System.out.println("you didn't enter enough numbers.");
        }
    }
}