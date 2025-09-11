import java.util.Scanner;
public class SBICreditCardEligibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter primary applicant age: ");
        int primaryAge = s.nextInt();
        System.out.print("Enter add-on card applicant age: ");
        int addonAge = s.nextInt();
        System.out.print("Enter employment type (1: Salaried, 2: Self-employed, 3: Student, 4: Retired): ");
        int employmentType = s.nextInt();
        System.out.print("Enter annual income: ");
        int income = s.nextInt();
        if (primaryAge >= 21 && primaryAge <= 60) {
            if (addonAge > 18) {
                if (employmentType >= 1 && employmentType <= 4) {
                    if (income <= 300000) {
                        System.out.println("Yes. You are eligible for SBI credit cards");
                    } else {
                        System.out.println("No. You are not eligible for SBI credit cards");
                    }
                } else {
                    System.out.println("No. You are not eligible for SBI credit cards");
                }
            } else {
                System.out.println("No. You are not eligible for SBI credit cards");
            }
        } else {
            System.out.println("No. You are not eligible for SBI credit cards");
        }
    }
}
