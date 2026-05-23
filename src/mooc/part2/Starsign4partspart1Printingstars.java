package mooc.part2;

public class Starsign4partspart1Printingstars {
    public static void printStars(int number) {
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
    }
