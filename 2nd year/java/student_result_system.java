
import java.util.Scanner;

class student_result_system{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int total = 0;

        for(int i = 1; i <= 5; i++){
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();

            total = total + marks;
        }

        float percentage = total / 5;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if(percentage >= 90){
            System.out.println("Grade: A+");
        }
        else if(percentage >= 80){
            System.out.println("Grade: A");
        }
        else if(percentage >= 70){
            System.out.println("Grade: B");
        }
        else if(percentage >= 60){
            System.out.println("Grade: C");
        }
        else if(percentage >= 40){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Result: Failed");
        }
    }
}