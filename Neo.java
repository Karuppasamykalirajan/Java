
    import java.util.Scanner;
public class Neo {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a =s.nextInt();
        int sum=0;
        int sq = a*a;
        while(sq>0){
            int digit=sq%10;
            sum =sum+ digit;
            sq/=10;
            
        }
        if(sum==a){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not neon number");
        }
}

    }


}
