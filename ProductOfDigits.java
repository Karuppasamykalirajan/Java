import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;   
            temp /= 10;
        }
        System.out.println(product);
    }
}
