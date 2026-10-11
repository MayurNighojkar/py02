import java.util.Scanner;

class reverse_number{
    static int reverse(int n, int rev){
        if(n == 0){
            return rev;
        }

        rev = rev * 10 + n % 10;

        return reverse(n / 10, rev);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = reverse(n, 0);

        System.out.println("Reverse = " + result);
    }
}
