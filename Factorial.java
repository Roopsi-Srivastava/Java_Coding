import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        int result =1;
        for(int i=1;i<=n;i++){
            result = result * i;
        }
        System.out.println("The factorial of given number is : " + result);
    }}

