import java.util.*;
public class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int result = 0;
        for(int i=1;i<=10;i++){
                result = n * i;
                System.out.println(result);
        }
    }
}