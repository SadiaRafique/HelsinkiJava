package mooc.part2;

public class Advancedastrology3partspart2Printingarightleaningtriangle {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printTriangle(int size){
        int i=0;
        while(i<=size){
            printSpaces(size-i);
            printStars(i);
            i++;
        }

    }
    public static void printSpaces(int x){
        int i=0;
        while(i<x){
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
