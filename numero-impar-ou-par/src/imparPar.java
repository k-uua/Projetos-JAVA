import java.util.Scanner;
public class imparPar {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite um número para saber se ele é par ou ímpar: ");
       int numero = scanner.nextInt();

       if(numero % 2 == 0){
        System.out.println("O número é par.");
       }
       else{
        System.out.println("O número é ímpar");
       }
       scanner.close();
    }
}
