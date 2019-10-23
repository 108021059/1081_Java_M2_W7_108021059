import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            int i = scn.nextInt();
            int sum= 0;
            for (int n=1 ; i<= n ; i++){
                sum=sum+i*(i+1);}
            System.out.println(sum);
    }
}
