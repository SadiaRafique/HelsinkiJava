package mooc.part2;

public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(7,7,5);
        System.out.println(answer);
    }
    public static int greatest(int number1, int number2, int number3) {
        return (number1 > number2) ? ((number1 > number3) ? number1:number3) : ((number2 > number3) ? number2:number3);
    }

    }
