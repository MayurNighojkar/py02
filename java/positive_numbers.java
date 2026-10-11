import java.util.Scanner;

class positive_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            if(n >= 0){
                System.out.println("its a positive number = " + n);
            }
        }
    }
}