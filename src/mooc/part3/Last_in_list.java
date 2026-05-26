package mooc.part3;

import java.util.Scanner;
import java.util.ArrayList;
public class Last_in_list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String name = input.nextLine();
            if(name.isEmpty()){
                break;
            }else{
                list.add(name);
            }
        }
        System.out.println(list.get(list.size()-1));
    }
}
