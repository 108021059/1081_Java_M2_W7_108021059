import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int n = scn.nextInt();
        BigInteger bi = new BigInteger("1");
        for (int i = n; i > 1; i--) {
        bi = bi.multiply(new BigInteger(Integer.toString(i)));
    }
    while (bi.mod(new BigInteger("10")).intValue()==0){
    count++;
    bi=bi.divide(new BigInteger("10"));
    }
    System.out.println(count);

 }
}

