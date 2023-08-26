import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inverter número");
            System.out.println("2. Calcular soma de 1 a 100");
            System.out.println("3. Calcular produto de 1 a 5");
            System.out.println("4. Exibir tabuada do 9");
            System.out.println("5. Exibir maior e menor valor");
            System.out.println("6. Calcular média dos números");
            System.out.println("7. Calcular soma dos dígitos ao cubo");
            System.out.println("8. Exibir números ímpares de 1 a 100");
            System.out.println("9. Exibir múltiplos de 3 de 1 a 50");
            System.out.println("10. Contar notas aprovadas");
            System.out.println("11. Contar pares antes do primeiro ímpar");
            System.out.println("12. Contar pares e ímpares");
            System.out.println("13. Contar números divisíveis");
            System.out.println("14. Calcular média dos divisíveis por 3");
            System.out.println("15. Contar números com mais de três dígitos");
            System.out.println("16. Calcular média entre 50 e 100");
            System.out.println("17. Encontrar menor valor positivo e ímpar");
            System.out.println("18. Contar pares e ímpares entre o primeiro e o último número");
            System.out.println("0. Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    inverterNumero();
                    break;
                case 2:
                    calcularSoma();
                    break;
                case 3:
                    calcularProduto();
                    break;
                case 4:
                    exibirTabuada();
                    break;
                case 5:
                    encontrarMaiorMenor();
                    break;
                case 6:
                    calcularMedia();
                    break;
                case 7:
                    calcularSomaDigitosCubo();
                    break;
                case 8:
                    exibirImpares();
                    break;
                case 9:
                    exibirMultiplosDeTres();
                    break;
                case 10:
                    contarNotasAprovadas();
                    break;
                case 11:
                    contarParesAntesImpar();
                    break;
                case 12:
                    contarParesImpares();
                    break;
                case 13:
                    contarDivisiveis();
                    break;
                case 14:
                    calcularMediaDivisiveisTres();
                    break;
                case 15:
                    contarDigitosMaioresTres();
                    break;
                case 16:
                    calcularMediaEntreCinquentaCem();
                    break;
                case 17:
                    encontrarMenorPositivoImpar();
                    break;
                case 18:
                    contarParesEImparesEntrePrimeiroEUltimo();
                    break;
            }
        } while (opcao != 0);
    }

    public static void inverterNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("Número invertido: " + numeroInvertido);
    }

    public static void calcularSoma() {
        int soma = 0;
        int i = 1;

        while (i <= 100) {
            soma += i;
            i++;
        }

        System.out.println("Soma: " + soma);
    }

    public static void calcularProduto() {
        int produto = 1;
        int i = 1;

        while (i <= 5) {
            produto *= i;
            i++;
        }

        System.out.println("Produto: " + produto);
    }

    public static void exibirTabuada() {
        int i = 1;

        while (i <= 10) {
            System.out.println("9 x " + i + " = " + (9 * i));
            i++;
        }
    }

    public static void encontrarMaiorMenor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros (0 para parar): ");
        
        int numero = sc.nextInt();

    }
}
