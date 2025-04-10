import java.util.Scanner;

public class MediaNotas {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 =  s.nextDouble();
        
        System.out.println("Digite a segunda nota:  ");
        double nota2 = s.nextDouble();

        System.out.println("Digite a terceira nota:  ");
        double nota3 = s.nextDouble();

        System.out.println("Digite a quarta nota:  ");
        double nota4 = s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média foi " + media + ".");

        if (media >= 7) {
            System.out.println(("Você está aprovado! :D"));
        } else if  (media >= 5) {
            System.out.println(("Você está de recuperação."));
        } else {
            System.out.println(("Você está reprovado :("));
        }
    }
}