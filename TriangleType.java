import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int side1 = s.nextInt();
        int side2 = s.nextInt();
        int side3 = s.nextInt();

        if ((side1 + side2 > side3) && 
            (side2 + side3 > side1) && 
            (side1 + side3 > side2)) {

            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a valid triangle");
        }

        
    }
}
