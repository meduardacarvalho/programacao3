import java.util.Scanner;

public class questao04lista05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pessoas [] = new double[5];
        double soma = 0;
       for (int index = 0; index < pessoas.length; index++) {
        System.out.println("digite a altura da pessoa " + (index));
        pessoas[index] = sc.nextInt();
        soma =   soma + pessoas[index]++;
       }
       System.out.println("a soma é de: " + soma);
    }
}
