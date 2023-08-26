import java.util.Scanner;

public class questao11lista05 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num, maior = Integer.MAX_VALUE, menor = Integer.MIN_VALUE;
     System.out.println("Digite uma sequência de números inteiros: ");
     num = sc.nextInt();
     while (num != 0) {
        if (num > maior) {
            maior = num;
        }
        
        if (num < menor) {
            menor = num;
        }
        
    }
    
    System.out.println("O maior valor digitado é: " + maior);
    System.out.println("O menor valor digitado é: " + menor);
    

    
        }
}
