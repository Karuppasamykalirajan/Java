import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();     
        char d = sc.next().charAt(0); 

        int first = -1, last = -1;

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == d) {
                if (first == -1) {
                    first = i + 1;  
                                }
                last = i + 1;     
            }
        }

        if (first == -1) {
            System.out.println("Digit not found");
        } else {
            System.out.println("First=" + first + ", Last=" + last);
        }

    }
}
