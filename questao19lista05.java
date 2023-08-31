import java.util.Scanner;

public class questao19lista05 {
    public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in); 
         int  num = 1, dois = 0, tres = 0, cinco=0;
         System.out.println("digite uma sequencia de numeros: ");
         while (num != 0) {
            num = sc.nextInt();
    
            if (num % 2 == 0) {
                dois++;
            } 
            if (num % 3 == 0) {
                tres++;
            }
             if (num % 5 == 0) {
                cinco++;
            }
        } 
    System.out.println("divisivel por dois: " + dois);
    System.out.println("por 3: " + tres);
    System.out.println("por 5: " + cinco);
    }
}
