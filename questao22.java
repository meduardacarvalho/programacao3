import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
         int  num = 1, soma = 0, cont = 0;
         System.out.println("digite uma sequencia de numeros: ");
         while (num != 0) {
            num = sc.nextInt(); 
            if (num >= 50 && num <=100) {
                cont++;
                soma += cont;
            }
           
        } 
        System.out.println("quantidade " + cont);
        System.out.println("soma: " + soma);
        System.out.println("media: " + soma / cont );
    }
}
