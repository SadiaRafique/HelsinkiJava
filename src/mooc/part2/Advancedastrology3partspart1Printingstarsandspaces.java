package mooc.part2;

public class Advancedastrology3partspart1Printingstarsandspaces {
    public static void main(String[] args) {
          printSpaces(5);
    }
    public static void printSpaces(int number) {
        int spaces = 0;
        while (spaces <= number) {
            System.out.print(" ");
            spaces++;
        }

    }
}
