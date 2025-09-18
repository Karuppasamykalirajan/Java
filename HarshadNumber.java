    import java.util.Scanner;
public class HarshadNumber {
    public static boolean isHarshad(int n) {
        if (n <= 0) return false; 
        int original = n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum == 0) return false;
        return original % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (isHarshad(x)) {
                System.out.println("Harshad Number");
            } else {
                System.out.println("Not Harshad Number");
            }
        }
        sc.close();
    }
}


