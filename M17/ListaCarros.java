import java.util.ArrayList;
import java.util.List;



class ListaCarros<T extends Car> {
    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void listarCarros() {
        for (T carro : carros) {
            System.out.println(carro);
        }
    }
}

