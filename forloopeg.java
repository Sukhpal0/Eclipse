package loops;
import java.util.*;

public class forloopeg {
    public static void main(String[] args) {
        // sum pf n prime numbers
        Scanner esc = new Scanner(System.in);
        System.err.println("Enter you prime no, to get it's sum");
        int num=esc.nextInt();

        int n=0;
        for(int i=1; i <= num; i++){
            n = n+i;
        }
        System.err.println(n); 
        esc.close();
    }
    
}
 