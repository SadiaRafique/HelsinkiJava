package mooc.part2;

public class Starsign4partspart1Printingstarspart3Printingarectangle {
    public static void main(String[] args) {
        printRectangle(17,3);
    }
    public static void printRectangle(int width, int height){
        int i = 1;
        while (i<=height){
            printStars(width);
            i++;
        }
    }
    public  static void printStars(int number) {
        int i = 1;
        while (i<=number){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}
