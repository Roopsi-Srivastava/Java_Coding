import java.util.* ;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int ans = 0;
        int b = num;
        while(num > 0 ){
            int rem = num % 10;
            num = num/10;
            ans = ans*10 + rem;
        }
        if(b == ans){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrme Number");
        }
    }}

