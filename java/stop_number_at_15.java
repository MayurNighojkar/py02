import java.util.Scanner;

class stop_number_at_15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            if(n == 15){
                System.out.println("Stopped");
                break;
            }

            System.out.println("You entered: " + n);
        }
    }
}