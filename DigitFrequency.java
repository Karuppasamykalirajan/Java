import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();  
        int[] freq = new int[10];             
        for (char c : num.toCharArray()) {
            freq[c - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.print(i + "→" + freq[i] + " ");
            }
        }
    }
}
