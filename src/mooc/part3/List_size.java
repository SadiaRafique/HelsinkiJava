package mooc.part3;

import java.util.Scanner;
import java.util.ArrayList;
public class List_size {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                break;
            } else {
                list.add(s);
            }
        }
        System.out.println("In Total: " + list.size());
    }
}