import java.util.Scanner;
class positivenegative{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int num = s.nextInt();
        if(num==0)
        System.out.println(" 0 is neither positive number or negative number ..");
        else if(num>0)
        System.out.println("positive number...");
        else
        System.out.println("Negative number...");

    }
}