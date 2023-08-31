import java.util.Scanner;

public class questao18lista05 {
     public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in); 
         int numero = 1;
    int pares = 0;
    int impares = 0;

    System.out.println("Digite uma sequência de números inteiros (0 para parar):");
    while (numero != 0) {
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
    } 

    System.out.println("Quantidade de números pares antes do primeiro ímpar: " + pares);
    }

}
