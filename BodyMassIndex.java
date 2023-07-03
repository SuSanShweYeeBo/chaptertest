import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter weight in kg:");
        double weight = input.nextDouble();
        System.out.println("Enter your height in cm:");
        double height = input.nextDouble();
        double heightInMeters = height * 0.01;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println(bmi);
        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if (bmi <25){
            System.out.println("Normal");

        }else if (bmi <30){
            System.out.println("Overweight");

        }else {
            System.out.println("Obese");
        }
    }
}
