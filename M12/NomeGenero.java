
import java.util.Scanner;
import java.util.TreeMap;

public class NomeGenero {

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);

            TreeMap<String, String> mapaNomes = new TreeMap<>();

            System.out.println("Digite nome e sexo separados por virgula (ex: Paulo - M, [...]): ");
            String entrada = s.nextLine();

            String[] separador = entrada.split(",");

                
            for (String par : separador) {
                String[] nomeGenero = par.split("-");

                if(nomeGenero.length == 2) {
                    String nome = nomeGenero[0].trim();
                    String genero = nomeGenero[1].trim();
                    mapaNomes.put(nome, genero);
                } else {
                    System.out.println("Formato invalido.");
                }

                System.out.println("\nNomes cadastrados:");
                for (String nome : mapaNomes.keySet()) {
                    System.out.println(nome);
                }

                System.out.println("\nGêneros cadastrados:");
                for (String genero : mapaNomes.values()) {
                    System.out.println(genero);
                }
            }
        }
    }