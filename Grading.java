import java.util.*;
public class Grading{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float marks = sc.nextFloat();
        if (marks > 90){
            System.out.println("A+");
        } else if(marks >= 80 && marks <= 90){
            System.out.println("B");
        } else {
            System.out.println("Work Hard");
        }
    }}

