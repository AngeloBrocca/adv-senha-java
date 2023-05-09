import java.util.Random;
import java.util.Scanner;

public class Main{
    public static char sorteia(){

        Random random = new Random();

        int numrandom = random.nextInt(95) + 33;
        char cr = (char) numrandom;

        return cr;

    }
    public static void get_contagem(String senha){

        int ord = 0;
        int i = senha.length();
        int tentativas = 0;
        char[] s = senha.toCharArray();

        while (ord<i){
            char cr = sorteia();
            tentativas++;

            if (cr == s[ord]){
                ord++;
            }
        }

        System.out.println("Foram necessárias "+ tentativas + " tentativas para descobrir a senha");

    }
    public static void main(String[]args){

        System.out.println("Insira Senha: ");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();

        get_contagem(senha);

    }
}