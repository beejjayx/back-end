    

public class mediaNotas {
    public static void main(String args[]) {
        calculoMedia();
    }

            
    private static void calculoMedia() {
    double nota1 = 9.5;
    double nota2 = 6.2;
    double nota3 = 5.7;
    double nota4 = 8.4;

        double resultado = (nota1 + nota2 + nota3 + nota4 / 4);
        System.out.println("A média das notas é: " + resultado);
    }
}