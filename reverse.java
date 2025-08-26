import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        int rev =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to reverse :");
        int num = s.nextInt();
        while(num!=0){
            int n = num%10;
            rev = rev*10+n;
            num = num/10;
        }
        System.out.println(rev);

    }
}
