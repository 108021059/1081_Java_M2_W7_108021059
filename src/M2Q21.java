import java.math.BigInteger;
import java.util.Scanner;

public class M2Q21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int n = scn.nextInt();
        BigInteger res = new BigInteger("1");
        for (int i = n; i > 1; i--) {
            res = res.multiply(new BigInteger(Integer.toString(i)));
        }
        while (res.mod(new BigInteger("10")).intValue()==0){
            count++;
        res = res.divide(new BigInteger(("10")));
    }
        System.out.println(count);
        }
}


