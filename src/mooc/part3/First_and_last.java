package mooc.part3;
import java.util.Scanner;
import java.util.ArrayList;
public class First_and_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            } else {
                list.add(s);
            }
        }
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

    }
}