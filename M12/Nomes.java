import java.util.Arrays;
import java.util.Scanner;

public class Nomes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String[] meuArray = new String[5];
        
        System.out.println("Digite os nomes separados por virgula: ");
        String entrada = s.nextLine();

        String[] nomes = entrada.split(",");

            
        for (int i = 0; i < meuArray.length; i++) {
            meuArray[i] = nomes[i];
        }

        Arrays.sort(meuArray);
        
        System.out.println("Nomes cadastrados: ");
        for (int i = 0; i < meuArray.length; i++) {
            System.out.println("Slot" + i + ": " + meuArray[i]);
        }
    }
}

