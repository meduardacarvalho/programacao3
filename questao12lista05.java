import java.util.Scanner;

public class questao12lista05 {
   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        int quantidade = 0;
        double media;
       
             System.out.println("Digite uma sequência de números inteiros (-1 para parar):");
            numero = sc.nextInt();
        while (numero != -1) {
         soma += numero;
         quantidade++;
         System.out.println("Digite uma sequência de números inteiros: ");
         numero = sc.nextInt();
     }
     media = soma / quantidade;
     System.out.println("soma: " + soma);
     System.out.println("quantidade: " + quantidade);
     System.out.println("a media: " + media);
           
    

       
     }
}
