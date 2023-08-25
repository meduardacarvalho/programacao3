import java.util.Scanner;

public class questao03lista05 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , x ;
        System.out.println("digite um numero inteiro: ");
        num = sc.nextInt();
        System.out.println("seus divisores são: ");
        for (int index = 1; index < num; index++) {
          if (num % index == 0) {
            System.out.println(index);
          }

            }
        }
      }

