/* first approach
/*
import java.util.Scanner;
public class to_find_largest_of_three_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if(b>max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);
    }
}*/

/*
second  approach
*/

/*
import java.util.Scanner;
public class to_find_largest_of_three_numbers {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int a = in.nextInt();
 int b = in.nextInt();
 int c = in.nextInt();
 int max = 0;
 if(a > b){
 max = a;
 } else {  max = b;
 }
 if (c > max){
 max = c;
 }
 System.out.println(max);
 }
}*/

import java.util.Scanner;
public class to_find_largest_of_three_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number to find : ");
        int a = in.nextInt();
        System.out.print("Enter second number to find : ");
        int b = in.nextInt();
        System.out.print("Enter third number to find : ");
        int c = in.nextInt();
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}

/*
Math is a class present in java.lang package and max is a
function present in it which takes two number as an argument and return maximum
out of them.
*/


