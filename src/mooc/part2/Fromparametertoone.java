package mooc.part2;

public class Fromparametertoone {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number){
        while(number>=1){
            System.out.println(number);
            number--;
        }
    }
}
