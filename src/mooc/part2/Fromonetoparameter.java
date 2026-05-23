package mooc.part2;

public class Fromonetoparameter {
    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number){
        int i=1;
        while(i<=number){
            System.out.println(i);
            i++;
        }
    }
}
