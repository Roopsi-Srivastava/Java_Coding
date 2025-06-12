import java.util.*;
public class Check {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if (a > 0){
            System.out.println("The given number is Positive");
        } else if ( a < 0 ){
            System.out.println("The given number is negative");
        } else{
            System.out.println("The given number is Zero");
        }
    }
}
