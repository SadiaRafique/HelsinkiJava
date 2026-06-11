package mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;
public class Only_these_numbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();
            while (true) {
                int number = Integer.valueOf(sc.nextLine());
                if (number == -1) {
                    break;
                }
                numbers.add(number);
            }

            System.out.println("");

            System.out.print("From where? ");
            int start = Integer.valueOf(sc.nextLine());

            System.out.print("To where? ");
            int end = Integer.valueOf(sc.nextLine());

            for (int i = start; i <= end; i++) {
                System.out.println(numbers.get(i));
            }
        }
    }
