import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println(sumOdd + " " + sumEven);

        
    }
}
