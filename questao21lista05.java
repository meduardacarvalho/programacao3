import java.util.Scanner;

public class questao21lista05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
         int  num = 1, soma = 0, cont = 0;
         System.out.println("digite uma sequencia de numeros: ");
         while (num != 0) {
            num = sc.nextInt(); 
            if (num >= 100) {
                cont++;
               
            }
           
        } 
        System.out.println("qtd num 3 digitos: " + cont);
       
    }
}
