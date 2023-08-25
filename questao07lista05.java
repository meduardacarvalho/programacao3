import java.util.Scanner;

public class questao07lista05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num, invertido = 0, digito ;
        System.out.println("digite um numero inteiro: ");
        num= sc.nextInt();
        while (num != 0) {
            digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        System.out.println("Número invertido: " + invertido);
    }


   
 
}
