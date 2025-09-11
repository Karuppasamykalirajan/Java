import java.util.Scanner;
public class DescendingOrder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read four numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a < b) { int temp = a; a = b; b = temp; }
        if (a < c) { int temp = a; a = c; c = temp; }
        if (a < d) { int temp = a; a = d; d = temp; }
        if (b < c) { int temp = b; b = c; c = temp; }
        if (b < d) { int temp = b; b = d; d = temp; }
        if (c < d) { int temp = c; c = d; d = temp; }
        System.out.println(a + " " + b + " " + c + " " + d);
        
    }
}

