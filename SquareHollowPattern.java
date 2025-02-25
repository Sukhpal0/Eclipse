package loops;

public class SquareHollowPattern {
    public static void Hollow(int n,int m){
        
        for(int i=1;i<=n;i++){
            for (int j=1;j<=m;j++) {
                if(i==1 || j==1 ||n==i || m==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=6;
        int m=6;
        Hollow(n, m);
    }
}
