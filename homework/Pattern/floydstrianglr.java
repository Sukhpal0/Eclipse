package loops.homework.Pattern;

public class floydstrianglr {
    public static void main(String[] args){
        int numb=1;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++) {

                System.out.print(numb+"  ");
                numb++;
            }System.out.println();
        }
    }
}
