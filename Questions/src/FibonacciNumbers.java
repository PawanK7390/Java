import java.util.Scanner;
public class FibonacciNumbers{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter fibonacci number to find : ");
        int n = in.nextInt();
        System.out.print("Starting number of fibonacci series : ");
        int a = in.nextInt();
        System.out.print("Next number of fibonacci series : ");
        int b = in.nextInt();
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
