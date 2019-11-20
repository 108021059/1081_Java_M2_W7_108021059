import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        float V1 =scn.nextFloat();
        float maxVo1 = V1 ;
        float minVo1 = V1 ;
          for(int i=0;i<9;i++) {
              V1=scn.nextFloat();
              if (maxVo1 < V1) {
                  maxVo1 = V1;
              }
              if
                 (minVo1 > V1) {
                  minVo1 = V1;
              }
          }
              System.out.printf("max=%.2f\n",maxVo1);
              System.out.printf("min=%.2f\n",minVo1);

       }




}
