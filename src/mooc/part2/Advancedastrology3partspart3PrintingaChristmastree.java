package mooc.part2;

public class Advancedastrology3partspart3PrintingaChristmastree {
    public static void main(String[] args) {
        christmasTree(4);
    }
    public static void christmasTree(int height){
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
    public static void printSpaces(int x){
        int i=0;
        while(i<x) {
            System.out.print(" ");
            i++;
        }
    }
    public static void printStars(int y){
            int i=0;
            while(i<y){
                System.out.print("*");
                i++;
        }
            System.out.println();
    }
}
