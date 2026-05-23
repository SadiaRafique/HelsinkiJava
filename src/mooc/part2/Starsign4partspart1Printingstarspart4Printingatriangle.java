package mooc.part2;

public class Starsign4partspart1Printingstarspart4Printingatriangle {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }

    }
    public static void printStars(int x) {
        int i = 1;
        while (i <= x) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}
