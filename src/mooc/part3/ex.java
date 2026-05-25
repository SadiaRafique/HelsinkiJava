package mooc.part3;

import java.util.Scanner;
public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer Number:");
        int n = Integer.valueOf(sc.nextLine());
    if(n==2000)
    {
        System.out.println("Customer recieves a bigger gift card.");
    } else if (n>=1000 && n%25==0) {
        System.out.println("Customer recieves a gift card.");
    }else {
        System.out.println("Customer recieves nothing.");
    }
    }
}
