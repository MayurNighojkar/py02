import java.util.Scanner;
public class palandrone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int num=sc.nextInt();
        int rev=0;
        int og_num=num;

        while (num!=0){

            int digit=num%10;

            rev=(rev*10)+digit;

            num = num/10 ;

        }
        
        if (og_num==rev){

            System.out.println("number is palandrone");
        }
        else {

            System.out.println("number is not palandrone");
        }
    }
}