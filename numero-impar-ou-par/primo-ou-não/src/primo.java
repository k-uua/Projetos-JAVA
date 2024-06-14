import java.util.Scanner;
public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é primo ou não: ");
        int numero = scanner.nextInt();
        int divisores = 0;

        for(int i = 1; i <= numero; i++ ){
            if(numero % i == 0){
                divisores++;
            }
        }
        if(divisores == 2){
            System.out.println("O número " + numero + " é primo.");
        }else{
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}
