package mooc.part3;

import java.util.Scanner;
import java.util.ArrayList;
public class Remember_these_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.valueOf(sc.nextLine());
        list.add(n);
        for (int j = 0; j < list.size(); j++) {
            if (n == -1) {
                break;
            }
            System.out.println(list.get(j));
        }
    }
}
