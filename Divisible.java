import java.util.Scanner;
public class Divisible {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }
    }