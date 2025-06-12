import java.util.*;
public class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0); 

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch =='o' || ch=='O' || ch == 'U' || ch == 'u'){
            System.out.println("It is a vowel");
        } else{
            System.out.println("It is a consonant");
        }
    }
}
