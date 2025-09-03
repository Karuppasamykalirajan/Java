import java.util.Scanner;
public class years {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the year:");

    int dayyears=365;
    int daysmonth = 30;
    int year=s.nextInt();
    year = year/dayyears;
    int temp = year%dayyears;
    int month = temp/daysmonth;
    int out = temp%daysmonth;
    int days =out;
    System.out.println("year:"+year);
    System.out.println("month:"+month);
    System.out.println("days:" +days);
}
}