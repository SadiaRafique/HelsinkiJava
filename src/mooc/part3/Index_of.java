package mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;
public class Index_of {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(sc.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        System.out.println("");
        System.out.print("Search for? ");
        int searchFor = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchFor) {
                System.out.println(searchFor + " is at index " + i);
            }
        }
    }
}
