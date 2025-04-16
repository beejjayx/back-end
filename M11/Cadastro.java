import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cadastro {

    private static Set<String> listaF = new HashSet<>();
    private static Set<String> listaM = new HashSet<>();
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o nome: ");
            String nome =  s.nextLine();
            
            System.out.println("Digite o sexo (F/M):  ");
            String sexo = s.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                ListaFeminina(nome);
            } else if (sexo.equalsIgnoreCase("M")){
                ListaMasculina(nome);
            }
        
        System.out.println("Deseja adicionar outro cadastro? (s/n)");
            String resposta = s.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }   

    private static void ListaFeminina(String nome) {
        System.out.println("*** Feminino ***");
        listaF.add(nome);
        System.out.println(listaF);
    }
    
    private static void ListaMasculina(String nome) {
        System.out.println("*** Masculino ***");
        listaM.add(nome);
        System.out.println(listaM);
    }
}

