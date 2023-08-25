import java.util.Scanner;

public class questao05list05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       
        for (int index = 1; index < 100; index++) {
            if ( index % 3 == 0) {
                System.out.println("fizz");
            }
            else if (index % 5 == 0 ){
                  System.out.println("buzz");
            }
             else if (index % 5 == 0 && index % 3 == 0){
                  System.out.println("fizzbuzz");
            }
            else {
                System.out.println(index);
            }
        }
     }
}
