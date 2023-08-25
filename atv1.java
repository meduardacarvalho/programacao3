import java.util.Scanner;

public class atv1 {
     public static void main(String[] args) {
        double [] aluno = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < aluno.length; index++) {
             System.out.println("digite a nota do aluno " + (index+1));
            aluno[index] = sc.nextInt();
            while (aluno[index] > 10 || aluno[index] < 0) {
                System.out.println("nota invalida. digite novamente");
                aluno[index] = sc.nextInt();
            }
            if (aluno[index] >= 7){
                System.out.println("aluno aprovado");
            }
        
            else {
                System.out.println("recuperação/reprovado");
            }
        }
       
     }
}
