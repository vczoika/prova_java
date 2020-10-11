import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida: ");
        double distancia = userInput.nextDouble();

        System.out.println("Digite o tempo em segundos: ");
        int tempo = userInput.nextInt();

        double velocidade = metodoVel(distancia, tempo);
        System.out.println("A velocidade é de: " + velocidade + "m/s");
    }

    public static double metodoVel(double distancia, int tempo) {
        double velocidade = distancia / tempo;
        return velocidade;
    }
}
