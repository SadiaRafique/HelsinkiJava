package mooc.part3;

import java.util.Scanner;
import java.util.ArrayList;
public class Third_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                list.add(name);
            }
        }
        if (list.size() >= 2) {
            System.out.println((list.get(2)));
        } else {
            System.out.println("you didn't enter enough names.");
        }
    }
}
