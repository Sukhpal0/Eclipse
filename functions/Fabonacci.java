import java.util.*;
public class Fabonacci{
    public static void PrintFactorial(int n){
        //loop
        int factorial = 1;
        for (int i=n; i>1;i++) {
            factorial= factorial * 1 ;
        }
        System.out.println(factorial);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintFactorial(n);
    }
}