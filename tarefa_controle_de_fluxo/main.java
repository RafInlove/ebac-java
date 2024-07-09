import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;
        double media;

        System.out.println("Bem-vindo(a) a calculadora de médias! Digite a primeira nota: ");
        notas[0] = ler.nextDouble();
        System.out.println("Bem-vindo(a) a calculadora de médias! Digite a segunda nota: ");
        notas[1] = ler.nextDouble();
        System.out.println("Bem-vindo(a) a calculadora de médias! Digite a terceira nota: ");
        notas[2] = ler.nextDouble();
        System.out.println("Bem-vindo(a) a calculadora de médias! Digite a quarta e última nota: ");
        notas[3] = ler.nextDouble();

        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        media = soma/notas.length;

        if(media >= 7) {
            System.out.println("Parabéns, você foi aprovado(a)!");
        }
        else if (media >= 5 && media <7) {
            System.out.println("Infelizmente você está de recuperação.");
        }
        else {
            System.out.println("Sinto muito, você foi reprovado(a)...");
        }
    }
}
