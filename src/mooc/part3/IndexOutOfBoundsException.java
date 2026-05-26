package mooc.part3;

import java.util.ArrayList;
public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.get(0));
    }
}
