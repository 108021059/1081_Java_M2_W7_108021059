import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int a=0 , b=0 , c=0;
        while (n!=-999){
            if(n>0){
                a++;}
            else if (n==0) {
                b++;
            }else {
                c++;
            }
            n = scn.nextInt();

            }
        System.out.println(a+"\n"+b+"\n"+c);
        }
    }

