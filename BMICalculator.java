import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter weight in pounds:");
        double weight = input.nextDouble();

        System.out.println("Enter height feet:");
        int heightFeet = input.nextInt();

        System.out.println("Enter height inches:");
        int heightInches = input.nextInt();

        int totalHeightInInches = (heightFeet * 12) + heightInches;
        input.close();

        double bmi = weight / Math.pow(totalHeightInInches, 2) * 703;

        System.out.println("your BMI is:" + bmi);

    }

}
