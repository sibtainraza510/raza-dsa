package recursionfolder;
import java.util.*;
public class recursionlevel1{
    public static void main(String[] args) {
        // func1(5);
        // func2(5);
        funcboth(5);
    }

    // public static void func1(int n){
    //     if(n == 0){
    //         return;
    //     }

    //     System.out.println(n);
    //     func1(n-1);

    // }

    // public static void func2(int n){
    //     if(n == 0){
    //         return;
    //     }

    //     func2(n-1);
    //     System.out.println(n);

    // }

    public static void funcboth(int n){
        if(n == 0 ){
            return;
        }
        System.out.println(n);
        funcboth(n-1);
        System.out.println(n);

    }

}