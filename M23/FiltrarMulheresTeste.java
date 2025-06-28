import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarMulheresTest {

    @Test
    public void testListaContemSomenteMulheres() {
        List<String> pessoas = Arrays.asList("Pedro - M", "Rosangela - F", "Ana - F", "Carlos - M", "Mariana - F");

        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.endsWith("F"))
                .collect(Collectors.toList());

        assertTrue(mulheres.stream().allMatch(pessoa -> pessoa.endsWith("F")), "A lista contém elementos que não são mulheres!");
    }
}
