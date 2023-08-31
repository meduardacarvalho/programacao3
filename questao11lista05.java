import java.util.Scanner;

public class questao11lista05 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num, maior = 0, menor = 0;
     System.out.println("Digite uma sequência de números inteiros, zero para parar: ");
     num = sc.nextInt();
     maior = num;
     menor = num;
     while (num != 0) {
   
        if (num > maior) {
            maior = num;
        }
        
        if (num < menor) {
            menor = num;
        }
         System.out.println("Digite uma sequência de números inteiros: ");
          num = sc.nextInt();
        
    }
    
    System.out.println("O maior valor digitado é: " + maior);
    System.out.println("O menor valor digitado é: " + menor);
    

    
        }
}
