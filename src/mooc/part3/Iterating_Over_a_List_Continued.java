package mooc.part3;

import java.util.ArrayList;
public class Iterating_Over_a_List_Continued {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i=3;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
