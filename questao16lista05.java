import java.util.Scanner;

public class questao16lista05 {
    public static void main(String[] args) { 
        double nota = 0;
        int aprovados = 0, cont = 0;
         Scanner sc = new Scanner(System.in);
        while (cont <5 ) {
            System.out.println("digite a nota do aluno:  " + (cont));
            nota = sc.nextDouble();
             
               if (nota >= 7){
                aprovados++;
         }
         cont++;
        
                
        }
         System.out.println("quantidade de alunos aprovados: " + aprovados);
                aprovados = sc.nextInt();
             
    }
}

