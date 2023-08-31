import java.util.Scanner;

public class questao13lista05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num, cont = 0;
        double cubo, soma = 0;
        System.out.println("digite : ");
        num = sc.nextInt();
        while (cont  < num) {
            System.out.println(cont);
            
            System.out.println(Math.pow(cont, 3));
            soma += Math.pow(cont, 3);
            System.out.println(soma);
            cont++;
            
        }
        System.out.println("soma: " + soma );
    }
}
