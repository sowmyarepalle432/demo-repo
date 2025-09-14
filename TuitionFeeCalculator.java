import java.util.Scanner;

public class TuitionFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student Grade (1-12): ");
        int grade = sc.nextInt();
        System.out.println("Enter Base Tution Fee:");
        int baseFee = sc.nextInt();
        System.out.println("Academic topper: (Yes/No)");
        String academicTopper = sc.next();
        int discountPercentage = 0;

        if (grade >= 9 && grade <= 12) {
            if (academicTopper == "Yes") {
                discountPercentage = 20;
            } else {
                discountPercentage = 10;
            }
        } else if (grade >= 6 && grade <= 8) {
            discountPercentage = 5;
        } else {
            discountPercentage = 0;
        }

        if (grade == 10) {
            discountPercentage += 3;
        } else if (grade == 12) {
            discountPercentage += 5;
        }

        double discountAmount = (baseFee * discountPercentage) / 100;
        double ActualFee = baseFee - discountAmount;

        System.out.println("Student Grade:" + grade);
        System.out.println("Base Fee:" + baseFee);
        System.out.println("Discount Amount:" + discountAmount);

        System.out.println("Fee To Pay:" + ActualFee);

    }
}