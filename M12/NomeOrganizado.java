import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class NomeOrganizado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Dois mapas para separar os gêneros
        TreeMap<String, String> grupoMasculino = new TreeMap<>();
        TreeMap<String, String> grupoFeminino = new TreeMap<>();

        System.out.println("Digite nome e sexo separados por virgula (ex: Paulo - M, [...]): ");
        String entrada = s.nextLine();

        String[] pares = entrada.split(",");

        for (String par : pares) {
            String[] nomeGenero = par.split("-");
            if (nomeGenero.length == 2) { 
                String nome = nomeGenero[0].trim();
                String genero = nomeGenero[1].trim().toUpperCase();

                // Adiciona ao grupo correspondente
                if (genero.equals("M")) {
                    grupoMasculino.put(nome, genero);
                } else if (genero.equals("F")) {
                    grupoFeminino.put(nome, genero);
                } else {
                    System.out.println("Gênero inválido para o nome: " + nome);
                }
            } else {
                System.out.println("Formato inválido: " + par);
            }
        }

        //grupo masculino
        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino.keySet()) {
            System.out.println(nome);
        }

        //grupo feminino
        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino.keySet()) {
            System.out.println(nome);
        }
    }
}
