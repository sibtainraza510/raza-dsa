package recursionfolder;
import java.util.*;
public class recursionbasicques{
//    static int sum = 0;
     
    // public static void main(String[] args) {
    //    System.out.println( funcques(5));
    // System.out.println(funcsum(5));
  
    // funcreverse(12321);
    // System.out.println(palindrome(12321));
    // System.out.println(sum);
    // }

    //factorial
    // public static int funcques(int n){
    //     if(n <= 1){
    //         return 1;
    //     }
    //     return n*funcques(n-1);
    // }

    //sum
    // public static int funcsum(int n){
    //     if(n == 1){
    //         return 1;
    //     }
    //     return n+funcsum(n-1);
        
    // }
    
    //reverse
    // public static void funcreverse(int n){
        
    //     if(n == 0){
    //         return;
    //     }
    //     int remainder = n%10;
    //     sum = sum*10 + remainder;
    //     funcreverse(n/10);

    // }

    //palindrome using reverse
    // public static boolean palindrome(int n){
    //     return (n == sum);

    // }


    public static void main(String[] args) {
        System.out.println(count(0));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
   
}