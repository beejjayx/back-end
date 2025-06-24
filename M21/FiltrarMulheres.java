import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarMulheres {
    public static void main(String[] args) {
        List<String> pessoas = Arrays.asList("Iruka - M", "Kurenai - F", "Mei - F", "Kiba - M", "Hinata - F");

        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.endsWith("F"))
                .collect(Collectors.toList());

        System.out.println(mulheres);
    }
}
