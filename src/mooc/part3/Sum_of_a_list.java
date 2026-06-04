package mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;
public class Sum_of_a_list {
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

        int sum = 0;
        for (int number : list) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}
