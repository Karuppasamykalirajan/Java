import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args) {
        int sum =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        for(int i =1;i<=n/2;i++){
                  if(n%i==0)
                  sum+=i;

        }
        if(sum==n && n!=0)
        System.out.println("Perfect number");
        else
        System.out.println("Not perfect number");
        
    }
}
