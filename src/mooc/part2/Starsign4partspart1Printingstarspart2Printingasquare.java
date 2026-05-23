package mooc.part2;

public class Starsign4partspart1Printingstarspart2Printingasquare {
    public static void main(String[] args) {
        printSquare(4);
    }
    public static void printSquare(int size){
        int i = 1;
        while(i<=size){
            printStars(size);
            i++;
        }

    }
    public static void printStars(int number){
        int i = 1;
        while(i<=number){
            System.out.print("*");
            i++;
        }
        System.out.println();

    }
}
