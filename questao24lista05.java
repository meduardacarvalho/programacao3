import java.util.Scanner;

public class questao24lista05 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int maior, menor, soma =0;
           System.out.println("digite o num maior: ");
           maior = sc.nextInt();
           System.out.println("digite o num menor: ");
           menor = sc.nextInt();

           while  (menor < maior){
           soma += menor;
            menor++;
           }
           System.out.println("soma:" + soma);
           
    }
}
