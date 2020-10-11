import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite sua idade: ");
        Scanner age = new Scanner(System.in);
        int verificarIdade = age.nextInt();

        if (verificarIdade >= 16) {
            System.out.println("Eleitor com idade para votar!");
        } else {
            System.out.println("Eleitor não tem idade para votar!");
        }

    }
}
