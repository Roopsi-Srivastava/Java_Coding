import java.util.*;
public class Normal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        if((a%4 == 0 && a%100 != 0) || (a%400 == 0)){
            System.out.println("The given year is a leap year");
        } else{
            System.out.println("The given year is a normal year");
        }
    }
}
