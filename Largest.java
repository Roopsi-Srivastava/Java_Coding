import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >b && a>c ){
            System.out.println("The largest number among all 3 values is :" + a);
        } else if( b> a && b>c) {
            System.out.println("The largest number among all 3 values is :" + b);
        } else{
            System.out.println("The largest number among all 3 numbers is :" + c);
        }
    }
}

