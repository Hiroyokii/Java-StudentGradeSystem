import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter your name: ");
        String nameStud = input.nextLine();

        System.out.print("Enter number of subjects: ");
        int studSub = input.nextInt();


        double[] grades = new double[studSub];
        double total = 0;

        for (int i = 0; i < studSub; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ":");
            grades[i] = input.nextDouble();
            total += grades[i];
        }

        double average = total / studSub;

        String status = (average <= 50) ? "Failed" : "Passed";

        System.out.println("Student: " + nameStud);
        System.out.println("Average grade: " + average);
        System.out.println("Status: " + status);

        input.close();
    }
}