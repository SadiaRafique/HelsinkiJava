package mooc.part1;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\nWhat is the main character called?");
        String first=scanner.nextLine();
        System.out.println("What is their job?");
        String second=scanner.nextLine();
        System.out.println("Here is the story:\nOnce upon a time there was "+ first + ",who was " + second + ".\nOn the way to work, " + first + " reflected on life.\nPerhaps " + first + " will not be " + second + " forever.");

    }
}
