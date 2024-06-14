import java.util.Random;
import java.util.Scanner;


public class Forca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] palavras = {"vaca", "galinha", "cachorro", "gato", "peixe", "coelho"};
        int randomizar = random.nextInt(palavras.length);
        String palavraEscolhida = palavras[randomizar];
        
        StringBuilder contador = new StringBuilder();
        for (int i = 0; i < palavraEscolhida.length(); i++) {
            contador.append("_ ");
        }
        int erros = 0;

        while (erros <= 5){
            System.out.println("Palavra: " + contador);
            System.out.println("Digite uma letra:(só pode errar 5 vezes) ");
            String letraUsuario = scanner.nextLine();
            Boolean letraEncontrada = false;
            for(int j = 0; j < palavraEscolhida.length(); j++){
                if(letraUsuario.charAt(0) == palavraEscolhida.charAt(j)){
                    contador.setCharAt(j * 2, letraUsuario.charAt(0));
                    letraEncontrada =  true;
                }
            }
        if (contador.indexOf("_") == -1) {
            System.out.println("Parabens! você acertou!");
            break;
        }
        
        if(!letraEncontrada){
            erros++;
            System.out.println("Letra errada! "+ erros + " erro.");
                
        }

        if(erros >= 5){
            System.out.println("Você perdeu a palavra era: "+ palavraEscolhida);
        }
        }

        scanner.close();
    }
}
