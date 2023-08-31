import java.util.Scanner;

public class questao20lista05 {
    
        public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in); 
         int  num = 1, soma = 0, tres = 0;
         System.out.println("digite uma sequencia de numeros: ");
         while (num != 0) {
            num = sc.nextInt(); 
            if (num % 3 == 0) {
                tres++;
                soma += tres;
            }
           
        } 
        System.out.println("qtd mutl de tres: " + tres);
        System.out.println("soma: " + soma);
        System.out.println("media: " + soma / tres );
    }
}
