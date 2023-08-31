import java.util.Scanner;

public class questao23lista05 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     int num, menor = 0;
     System.out.println("Digite uma sequência de números inteiros, zero para parar: ");
     num = sc.nextInt();
     menor = num;
     while (num != 0) {
        if (num < menor && num > 0 && num %2 != 0)  {
            menor = num;

        }
         System.out.println("Digite uma sequência de números inteiros: ");
          num = sc.nextInt();
        
    }
    
  
    System.out.println("O menor valor digitado é: " + menor);
    
    }
}
